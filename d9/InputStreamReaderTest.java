package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
			try(InputStreamReader isr= new InputStreamReader(new FileInputStream("reader.txt"))){
				//한글로 작성된 파일을 읽을 때 사용 InputStreamReader
				int i;
				while( (i = isr.read()) != -1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				
			}
	}

}
