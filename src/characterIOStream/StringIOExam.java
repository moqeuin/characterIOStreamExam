package characterIOStream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringIOExam {

	public static void main(String[] args) {
		
		// CharArrayStream과 마찬가지로 입출력에 대상이 메모리인 스트림이다.
		// 또한 마찬가지로 내부버퍼를 이용해서 입출력을 한다.
		
		String str = "ABDF";
		
		StringReader sr = new StringReader(str);
		StringWriter sw = new StringWriter();
		
		int data = 0;
		
		try {
			while((data=sr.read()) != -1) {
				
				sw.write(data);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sw.toString()); // 배열이 아닌 문자열이기 때문에 스트림에서 직접적으로 출력이 가능하다.

	}

}
