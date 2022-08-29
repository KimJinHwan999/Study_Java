package object;

class Calc{
	int sum(int x, int y) {
			return x + y;
	}
}

public class Main04 {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		int a = c1.sum(10, 20);
		System.out.println(a);		// 다른 덧셈을 하고 싶다고 굳이 c2를 만들 필요 없이 재사용 하면 됨
		
		// 객체를 각자 생성하는 경우
		// 좋은 방법은 아님
		/*
		Calc c2 = new Calc();
		int b = c2.sum(20, 30);
		System.out.println(b);
		*/
		
		/*
		 * - 파라미터에 의해 결과를 리턴하는 경우, 
		 * 서로 다른 값을 위하여 객체를 여러 개 생성할 필요가 없다.
		 * 
		 * - 자체적으로 데이터를 갖는 형태가 아니라 외부적인 요인인 파라미터에 의해서 결과가 생성되므로, 
		 * 하나의 객체를 재사용하는 것이 바람직하다
		 */
		
		int c = c1.sum(20, 30);
		System.out.println(c);
	}
}
