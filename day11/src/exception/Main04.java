package exception;

public class Main04 {

	public static void main(String[] args) {
		try {
			String year2 = "뭘까";
			int age2 = 2022 - Integer.parseInt(year2) + 1;			// 에러 발생 시점 (여기서 catch 구문으로 내려감)	
			System.out.println(age2);	
		} catch( NumberFormatException e ){						// 예외 클래스 객체를 받아오는 지역변수 파라미터는 보통 e로 설정함.
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());	// 에러의 내용을 받아보는 메서드 e.getMessage();  
			e.printStackTrace(); 											// 에러내용 전체 확인 해주는 메서드	
		}	
			
		System.out.println("-----------프로그램을 종료합니다-------------");		// try-catch문으로 프로그램 정상종료
		
	}
}
