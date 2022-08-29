package practice_extendsobject;

class Hello {
	public void say() {
		System.out.println("Hello");
	}
}

class English extends Hello {}

class Korean extends Hello {
	public void say() {
		System.out.println("안녕하세요");
	}
}

public class Main03 {
	public static void main(String[] args) {
		English e = new English();
		Korean k  = new Korean();
		
		e.say();
		k.say();
	}
}
