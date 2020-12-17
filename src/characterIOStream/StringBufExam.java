package characterIOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringBufExam {

	public static void main(String[] args) {
		
		// bufferdReader/Writer는 스트림을 입출력 효율을 높이기 위한 보조스트림의 역할을 한다.
		// 텍스트 파일에서 데이터를 입력받고 그리고 그 데이터를 다른 텍스트 파일에 출력하는 코드(출력하기 전 데이터도 보여준다)
				
		try {
			
			// 1. 텍스트 파일 읽기
			
			// 파일에서 문자데이터(영어,숫자 외) 읽어오기 위해서 파일리더 스트림 사용
			FileReader fr = new FileReader(".\\test.txt");
			// 입출력 작업의 효율을 높이기 위해서 버퍼스트림 사용
			BufferedReader  br = new BufferedReader(fr);
			
			// 전체 데이터를 저장할 문자열
			String totalData = "";
			// 한 줄씩 입력받을 문자열
			String data = "";
			
			// readLine() : 문자열을 개행문자 기준으로 한 줄씩 반환시킨다. 개행문자은 포함하지 않고 반환
			while((data=br.readLine()) != null) {
				
				data += "\n";
				totalData += data; 
			}
			
			// 2. 추가하기 전에 텍스트 파일 읽어오기
			
			FileReader fr2 = new FileReader(".\\test2.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			
			String totalData2 = "";
			
			while( (data=br2.readLine()) != null) {
				data += "\n";
				totalData2 += data;
			}
 			
			System.out.println(totalData2);
			
			// 3. 다른 텍스트 파일에 데이터 출력
			
			// 기존 파일에 데이터에다가 덮어씌우기가 아닌 데이터를 추가하고 싶다면 true를 2번 째 매개변수로 주면된다.
			FileWriter fw = new FileWriter(".\\test2.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("-------새로운 데이터 추가-------");
			bw.newLine();
			bw.write(totalData);
			bw.flush();
			bw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}	

}
