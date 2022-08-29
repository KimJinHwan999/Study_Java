package practice_hiding;

class User{
	public String name = "자바학생";
	private int age = 20;
	
}

public class Main01 {
	// 은닉성
	public static void main(String[] args) {
		
		User user = new User();
		System.out.println(user.name);
//		System.out.println(user.age);
	}
	
	
}
