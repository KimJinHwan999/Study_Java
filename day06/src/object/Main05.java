package object;

class Calc2{		// 설계도
//	데이터 타입은 전체 int
	
//	덧셈 결과 return, 파라미터 2개 메서드 생성
	
//	뺼셈 결과 return, 파라미터 2개 메서드 생성
	
//	곱셈 결과 return, 파라미터 2개 메서드 생성
	
//	나눗셈 몫에 대한 결과 return, 파라미터 2개 메서드 생성
	
	
	int plus(int x, int y) {		// 메서드 들의 정의
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	int multi(int x, int y) {
		return x * y;
	}
	
	int divide(int x, int y) {
		int result = 0;
		if( y != 0 ) {	//	0으로 나눌 수 없으므로
			result = x / y;
		}
		return result;
	}
	
	
	
}



public class Main05 {
	public static void main(String[] args) {
//		Calc2 클래스로 객체 생성 후
//		덧셈
//		뺼셈
//		곱셈
//		나눗셈
//		결과를 각각 출력
		
		Calc2 calculator = new Calc2();
		
		int a = calculator.plus(10,20);
		System.out.println(a);
		
		int b = calculator.minus(20,30);
		System.out.println(b);
		
		int c = calculator.multi(30, 2);
		System.out.println(c);
		
		int d = calculator.divide(6, 3);
		System.out.println(d);
	}
}
