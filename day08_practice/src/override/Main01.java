package override;

class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

class Korean extends Hello{
	public void say() {
		System.out.println("안녕하세요");
	}
	
	public void sayhello() {
		super.say();
		this.say();
	}
}

public class Main01{
	public static void main(String[] args) {
		Korean k = new Korean();
		
		k.sayhello();
		k.say();
	}
}