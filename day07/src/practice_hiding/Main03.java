package practice_hiding;

public class Main03 {
	public static void main(String[] args) {
		Member m = new Member();
		m.setAge(21);
		
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
	}
}
