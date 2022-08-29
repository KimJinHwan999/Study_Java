package condition;

public class Main03 {
	public static void main(String[] args) {
		
		boolean is_Korean = true;
		
		if(is_Korean == true) {
			System.out.println("한국사람 입니다.");
		}else {
			System.out.println("한국사람이 아닙니다.");
		}
		
		if(is_Korean) {
			System.out.println("한국사람 입니다.");
		}else {
			System.out.println("한국사람이 아닙니다.");
		}
		
		if(!is_Korean) {
			System.out.println("한국사람 입니다.");
		}else {
			System.out.println("한국사람이 아닙니다.");
		}
	}
}
