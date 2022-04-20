package ch15;

public class BookShlefTest {

	public static void main(String[] args) {
			Queue bookQueue = new BookShelf();
			bookQueue.enQueue("토지1");
			bookQueue.enQueue("토지4");
			bookQueue.enQueue("토지5");
			bookQueue.enQueue("토지3");
			bookQueue.enQueue("토지2");
			
			System.out.println(bookQueue.getSize());
			System.out.println(bookQueue.deQueue());
			System.out.println(bookQueue.deQueue());
			System.out.println(bookQueue.deQueue());
			System.out.println(bookQueue.deQueue());
			System.out.println(bookQueue.deQueue());
	}

}
