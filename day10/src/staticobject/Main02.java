package staticobject;

public class Main02 {

	public static void main(String[] args) {
//		Calc c1 = new Calc();
//		int a = c1.plus(20, 10);
//		
//		Calc c2 = new Calc();
//		int b = c2.minus(20, 10);
		
		// 위 방법보단 아래방법이 메모리를 아낌
		// main02 에서 뿐만 아니라 프로젝트 전반적으로 객체를 하나만 만들어서 가져다 쓸 순 없을까?
		// -> 클래스 자체를 고정 메모리 영역에 올려놓자! (single ton 디자인 패턴)
		
//		Calc c3 = new Calc();
//		int c = c3.plus(20, 10);
//		int d = c3.minus(20, 10);
		
		
		/*
		 * 싱글톤 객체 사용하기
		 * - getInstance() 메서드를 사용하여 객체를 리턴 받는 형식으로 사용한다.
		 * - 여러 객체를 리턴받더라도 모두 하나의 static 객체를 참조하게 되기 때문에
		 * 전역 객체 하나만이 메모리에 할당되게 된다.
		 */
		
		Calc c = Calc.getInstance();
		int e = c.plus(20, 10);
		System.out.println(e);
		System.out.println(Calc.getInstance().minus(20, 10));
		
	}
}
