package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
			
		Powder powder = new Powder();
		ThreeDPrinter4 printer = new ThreeDPrinter4();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder) printer.getMaterial();
		System.out.println(printer);
	}

}
