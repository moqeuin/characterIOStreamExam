package characterIOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOExam {

	public static void main(String[] args) {
		/*
		 표준입출력 스트림은 자바에서 콘솔과 입출력 작업을 하기위해서 자동적으로 생성하는 스트림이다.
		 System클래스의 변수인 in, out, err로 이용해서 입출력을 작업한다.
		 PrintStream은 데이터를 문자로 출력해주는 스트림을 의미한다.
		 System.out변수는 PrintStream형이라 둘 다 병행해서 사용한다.
		*/
		
		// read()나 readLine() 메서드를 사용하면 스레드를 생성해서 입력을 할 때까지 대기한다.
		//int input = System.in.read(); 
		//System.out.println(input);
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			
			// 입출력 대상을 콘솔에서 파일로 지정. 
			System.setOut(ps);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	System.out.println("test.txt로 바꾼 출력대상");
		
		

	}

}
