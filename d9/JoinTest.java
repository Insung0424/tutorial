package ch20;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start;i<=end;i++) {
			total += i;
		}
	}

	public static void main(String[] args) {

			JoinTest jt1 = new JoinTest(1,50);
			JoinTest jt2 = new JoinTest(51,100);
			
			jt1.start();
			jt2.start();
			
			try {
				jt1.join();   // start(); 만 사용하면 실행이 완료되기전에 main Thread가 
				jt2.join();	//  종료될 수 있으므로 join을 사용해서 처리한다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int lastTotal = jt1.total + jt2.total;
			
			System.out.println(jt1.total);
			System.out.println(jt2.total);
			System.out.println(lastTotal);
			
	}

}
