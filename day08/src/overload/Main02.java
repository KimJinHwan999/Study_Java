package overload;

class Hello{
	
	// 파라미터의 타입에 따라 생성자를 오버로딩 해준 모습 <Hello() 와 Hello( String msg )>
	Hello(){		// Hello 라는 이름의 class의 기본 생성자 Hello()
		System.out.println("Hello");
	}
	
	Hello(String msg){		// String msg를 받는 Hello() 라는 이름의 생성자
		System.out.println( msg );
	}
}

public class Main02 {
	
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello("안녕하세요");
	}
	// 객체를 생성할 때 다양한 방법으로 객체를 생성할 수 있게 된다.
	

}
