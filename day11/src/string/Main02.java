package string;

public class Main02 {

	public static void main(String[] args) {
		// 1. 이메일 주소에서 아이디와 도메인을 구별하기
		// 단, split 사용 금지
		
		String email = "student@java.com";
		
		// 결과 : 아이디	-> student
		// 결과 : 도메인	-> java.com
		
		
		
		// "@"가 나타나는 위치 얻기
		int a = email.indexOf("@");
		
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String id = email.substring(0, a);
		
		// "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String domain = email.substring(a+1);
		
		System.out.println("아이디 : " + id);
		System.out.println("도메인 : " + domain);
		
		
	}
}
