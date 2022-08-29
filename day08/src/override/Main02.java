package override;


class Hello2{
	Hello2(String msg){//4 도착
		System.out.println(msg);
}
}

class Korean2 extends Hello2 {
		// 부모와 동일한 파라미터를 받도록 생성자를 정의하고
		// 전달 받은 파라미터를 부모에게 재전달 해야한다.
	Korean2(String msg) {	// 2. super로 내려감
		super(msg);			// 3. Hello2로 올라감
		// TODO Auto-generated constructor stub
	}
	
}





public class Main02 {
	public static void main(String[] args) {
		Korean2 kor = new Korean2("사용자"); 	//1. Korean2 로 올라감	
		/*
		 * 자식클래스 하나만으로 객체를 생성했지만, 내부적으로는 자식클래스와 부모클래스인 Hello2로도 객체가 생성되어 있는 상태 
		 * (자식클래스를 불러서 부모클래스 객체를 호출해준 것) -> 부모클래스의 멤버변수와 메서드를 사용할 수 있었던것
		 */

		
	}
}
