package object;

class HelloWorld{
	String message;
	
	void sayHello() {	// 출력해주는 메서드
		System.out.println(message);
	}
	
	void setEng() {		// 값을 할당해 주는 메서드 1
		message = "Hello Java";
	}
	
	void setKor() {		// 값을 할당해 주는 메서드 2
		message = "안녕하세요 자바";
	}
}

public class Main03 {
	public static void main(String[] args) {
		
		/*
		 * HelloWorld 클래스로 객체 생성,
		 * [결과값]
		 * Hello Java
		 * 안녕하세요 자바
		 */
		
		HelloWorld hello = new HelloWorld();
		
		hello.setEng();		// message = "Hello Java";
		hello.sayHello();	// System.out.println(message);
		
		hello.setKor();		// message = "안녕하세요 자바";
		hello.sayHello();	// System.out.println(message);
	}
}
