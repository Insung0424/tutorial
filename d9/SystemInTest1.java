package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		int i;
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = System.in.read()) != '\n') {
//			System.out.println(i);
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
