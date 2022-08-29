package hiding;

/*
 *  하나의 소스파일에 하나의 public클래스만 존재할 수 있기 떄문에
 *  Member 클래스를 다른 파일로 나누어 놓았다.
 */

public class Main03 {
	
	public static void main(String[] args) {
	
		Member m = new Member("자바학생", 20);
		
		m.setAge(21);
		
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		
		
		
	}
}
