package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		// 1. 파일 열기
		FileInputStream fis = new FileInputStream("C:\\Users\\agdis\\eclipse-workspace\\Chapter6\\src\\ch14\\FileInputStreamTest1.java");
		         
		// 2. 파일 읽기 (4Byte)
		byte[] BOM = new byte[4];
		fis.read(BOM, 0, 4);
		         
		// 3. 파일 인코딩 확인하기
		if( (BOM[0] & 0xFF) == 0xEF && (BOM[1] & 0xFF) == 0xBB && (BOM[2] & 0xFF) == 0xBF )
		    System.out.println("UTF-8");
		else if( (BOM[0] & 0xFF) == 0xFE && (BOM[1] & 0xFF) == 0xFF )
		    System.out.println("UTF-16BE");
		else if( (BOM[0] & 0xFF) == 0xFF && (BOM[1] & 0xFF) == 0xFE )
		    System.out.println("UTF-16LE");
		else if( (BOM[0] & 0xFF) == 0x00 && (BOM[1] & 0xFF) == 0x00 &&
		         (BOM[0] & 0xFF) == 0xFE && (BOM[1] & 0xFF) == 0xFF )
		    System.out.println("UTF-32BE");
		else if( (BOM[0] & 0xFF) == 0xFF && (BOM[1] & 0xFF) == 0xFE &&
		         (BOM[0] & 0xFF) == 0x00 && (BOM[1] & 0xFF) == 0x00 )
		    System.out.println("UTF-32LE");
		else
		    System.out.println("EUC-KR");
	}

}
