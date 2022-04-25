package ch01;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = title;
	}

//	@Override
//	public String toString() {
//		return title + "," + author;
//	}
	
}


public class BookTest {

	public static void main(String[] args) {
			Book book = new Book ("데미안", "헤르만 헤세");
			
			System.out.println(book); //7a81197d 가상메모리 16비트
			// 오버라이딩으로 재정의 (return title + "," + author;) 하면 "데미안", "헤르만 헤세" 나옴
			String str = new String("test");
			System.out.println(str.toString()); // test 오버라이딩 되있어서 그대로 반환됨
	}

}
