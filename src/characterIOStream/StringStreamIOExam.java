package characterIOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringStreamIOExam {

	public static void main(String[] args) {
		String line = "";
		// inputStreamReader/Writer는 바이트기반 스트림을 문자기반스트림과 연결해주고 바이트 데이터를 지정한 인코딩에 따라 변환시켜준다.
		
		// System.in 변수는 바이트기반 스트림 InputStream형이다.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("사용중인 os의 인코딩" + isr.getEncoding()); // UTF-8
		int test = 0;
		try {
			test = System.in.read();
			System.out.println(test);
			
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
		/*
		do {
			
			try {
				System.out.println("문장입력을 종료하려면 q를 입력");
				line = br.readLine();
				System.out.println("입력한 문장 : " + line);
				
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} while (!line.equals("q"));
		//br.close; 표준입출력은 닫지않아도 된다.
		System.out.println("시스템 종료");
		*/
	}

}
