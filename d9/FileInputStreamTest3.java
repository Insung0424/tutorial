package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			while ( (i=fis.read(bs)) != -1) {
				//     (i=fis.read(bs, 1 , 9)) != -1)
				//                bs에서 1번 부터 9byte만 읽는다.
//				for(int ch : bs) {
//					System.out.print((char)ch);
////					ABCDEFGHIJ :  10 read
////					KLMNOPQRST :  10 read
////					UVWXYZQRST :  6 read   마지막 Z 이후 QRST가 남아있어서 출력됨
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
//					ABCDEFGHIJ :  10 read
//					KLMNOPQRST :  10 read
//					UVWXYZ :  6 read    
				}
				System.out.println(" :  " + i + " read");	
			}
		} catch (IOException e){
			System.out.println(e);
		}

		
	}

}
