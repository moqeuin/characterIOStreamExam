package characterIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExam {

	public static void main(String[] args) {
		
		// 문자 기반 스트림
		// 2바이트 크기로 데이터를 입출력한다.
		// 인코딩과 유니코드 사이에 변환을 자동적으로 수행해준다.
		
		
		String fileName = "test.txt";
	
		try {
			FileInputStream fos = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
				
			while( (data=fos.read()) != -1 ) {
				
				// 1바이트씩 넘어오기 떄문에 2바이트로 표현되는 한글은 표현할 수 없다.
				System.out.print((char)data);
				// ìëíì¸ì íì¤í¸ì© ë´ì©ìëë¤.
				fos.close();
			}
			
			System.out.println();
			
			while( (data=fr.read()) != -1) {
				
				// 문자기반 스트림은 입출력할 때 유니코드와 인코딩(장치)간에 자동적으로 변환해준다.
				// 2바이트씩 데이터를 입력하기 때문에 한글이 제대로 나온다.
				// 2바이트의 데이터를 유니코드 형식으로 해석해서 숫자로 변환한다.
				// 그리고 자바에서 문자형으로 해석하면 유니코드에 대응하는 문자를 얻을 수 있따.
				System.out.print((char)data);
				// 안녕하세요 테스트용 내용입니다.
				
				fr.close();
			}	
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
