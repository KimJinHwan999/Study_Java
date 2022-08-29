package override;

class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

class Korean extends Hello{
	// Korean 클래스에 의해 say()메서드가 Override된 경우
	public void say() {
		System.out.println("안녕하세요");
	}
	
	public void sayHello() {
		super.say();		// 부모클래스(Hello)에 정의되어 있는 say()
		this.say();			// 나 자신(Korean)에게 있는 say()
	}
}

public class Main01 {
	public static void main(String[] args) {
		Korean kor = new Korean();
		kor.sayHello();
		System.out.println("------------------------");
		
		kor.say();
		
	}
}
