package patterncheck;

public class Main02 {

	public static void main(String[] args) {
		String name = "자바학생";
		String age = "19";
		String email = "student@java.net";
		String phone = "01012345678";
		String blank = "123";
		
		// RegexHelper 에서 만든 메서드 사용해서 데이터 검증.
		RegexHelper rh = RegexHelper.getInstance();
		
		String b = rh.blank(blank);
		String n = rh.kor(name);
		String a = rh.num(age);
		String e = rh.email(email);
		String p = rh.num(phone);
		
		System.out.println(n);
		System.out.println(a);
		System.out.println(e);
		System.out.println(p);
		System.out.println(b);
		
		System.out.println("회원가입 절차를 진행합니다.");
				
		
	}
}
