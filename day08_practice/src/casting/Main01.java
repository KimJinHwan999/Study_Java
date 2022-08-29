package casting;

class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

class Korean extends Hello{
	public void say() {
		System.out.println("안녕하세요");
	}
	
	public void talk() {
		System.out.println("또만났네요");
	}
}
public class Main01 {
	public static void main(String[] args) {
		Hello k = new Korean();
		
		k.say();	// 형변환을 해도 오버라이드된 기능만 사용가능. 추가적으로 구현한 기능은 사용할 수 없다
//		k.talk();
		
	}
	
	
}
