package abstractobject;

/*
 * 추상클래스를 상속받는 과정은 일반클래스의 상속과 동일하게 extends를 사용한다.
 */

public class Korean extends Hello{

	// 부모 클래스의 생성자 강제 호출
	public Korean(String msg) {
		super(msg);
	}
	
	/*
	 * 추상클래스는 이와 같이 자식클래스가 정의해야 하는 규격을 강제하기 위하여 사용한다.
	 */
	@Override
	public void sayHello() {
		
	}
}
