package ch23;

import java.io.IOException;
import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> shelf = new ArrayList();
	
	public FastLibrary() {
		shelf.add("mountain1");
		shelf.add("mountain2");
//		shelf.add("mountain3");
//		shelf.add("mountain4");
//		shelf.add("mountain5");
//		shelf.add("mountain6");
//		shelf.add("mountain7");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while( shelf.size() == 0) { //책이 한권도 없을때 wait loop
			System.out.println(t.getName() + "wait");
			wait(); //최상위 obj 에서 상속받으므로 지정없이 그대로 실행?
			System.out.println(t.getName() + "end");
		}
		
		if(shelf.size() > 0 ) { //책이 있을때 
			String book = shelf.remove(0);
			System.out.println( t.getName() +" " + book  +" " + "lend" );
			return book;
		}
		else return null;
		
	}
	
	public  synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		// 책을 반납할 때
		shelf.add(book);
		notifyAll(); // 기다린 Thread 전체를 호출
		System.out.println( t.getName() +" " + book  +" " + "return" );
	}
}

class Student extends Thread{
	
	public Student(String name) {
		super(name);
	}
	public void run() {
		
		try {
			String title = LibraryMain.Library.lendBook();
			if(title == null) {
				System.out.println("can't lend");
				return;
			}
			sleep(1000);
			LibraryMain.Library.returnBook(title);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class LibraryMain {
	
	public static FastLibrary Library = new FastLibrary();

	public static void main(String[] args) {

			Student std1 = new Student("std1 ");
			Student std2 = new Student("std2 ");
			Student std3 = new Student("std3 ");
			Student std4 = new Student("std4 ");
			Student std5 = new Student("std5 ");
			Student std6 = new Student("std6 ");
			Student std7 = new Student("std7 ");
			Student std8 = new Student("std8 ");
			
			std1.start();
			std2.start();
			std3.start();
			std4.start();
			std5.start();
			std6.start();
			std7.start();
			std8.start();
				
	}

}
