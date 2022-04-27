package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fis = new FileOutputStream("output.txt")){
			fis.write(65);
			fis.write(66);
			fis.write(67);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
		
	}

}
