package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		/*
		 *  문자열을 파일로 저장
		 *  	-> 문자열을 파일로 저장하기 위해서는 byte배열로 변환
		 *  	-> 문자열을 byte 배열로 변환하기 위해서는 getBytes() 메서드를 사용하는데,
		 *  	이 때, 변환과정에서 사용할 인코딩 형식을 지정해 주어야 한다.
		 */
		
		// 저장할 파일의 경로
		String path = "text.txt";	//	특정 경로에 담고싶다면 경로를 넣어도 됨
		
		// 파일에 저장할 내용
		String write_string = "안녕하세요 Hello World";
		
		// 특정 인코딩 방식(utf-8) 적용 (예외 처리 강제됨)
		// 객체나 배열이 선언과 할당에 대한 블록이 서로 분리되어 있을 경우
		// 명시적으로 빈 영역임을 알리기 위하여 null로 초기화
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");		// byte 배열형태로 쪼개기
		} catch (UnsupportedEncodingException e) {
			
			System.out.println("[ERROR] 알 수 없는 인코딩 정보 >> " + path);
			e.printStackTrace();
			
		}catch(Exception e) {
			
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
			e.printStackTrace();
			
		}

		// 파일 저장 절차 시작
		// finally 블록에서 인식하기 위해서 선언부를 위로 이동시킨다.
		OutputStream out = null;
		try {
			out = new FileOutputStream(path);
			// 파일 쓰기
			out.write(buffer);
			System.out.println("[INFO] 파일 저장 성공 >> " + path);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음 >> " + path);
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("[ERROR] 파일 저장 실패 >> " + path);
			e.printStackTrace();
			
		} catch(Exception e) {
			
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
			e.printStackTrace();
			
		}finally {
			// 저장의 성공여부에 상관없이 스트림은 무조건 닫아야 한다.
			try {
				out.close(); 				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}
}
