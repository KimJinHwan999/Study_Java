package condition;

public class Main08 {

	public static void main(String[] args) {
		
		
		/*
		 * 1. 만약 3000원 이상의 돈을 가지고 있다면 택시를 타고,
		 * 그렇지 않으면 걸어가라
		 */
		
		int money1 = 2000;
		
		if(money1 >= 3000) {
			System.out.println("택시 타기");
		}else {
			System.out.println("걸어 가기");
		}
		
		
		
		
		
		System.out.println("--------------------------");
		/*
		 * 2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고
		 * 그렇지 않으면 걸어가라
		 */
		int money2 = 1000;
		boolean hasCard = true;
		
		if(money2 >= 3000 || hasCard) {
			System.out.println("택시 타기");
		}else {
			System.out.println("걸어 가기");
		}
		
		
		
		
		
		System.out.println("--------------------------");
		/*
		 * 3. 어떤 특정 정수 a가 짝수이면 "짝수", 홀수이면 "홀수" 라고 출력
		 */
		int d = 3;
		
		if(d%2 == 0) {
			System.out.println("짝수");
		}else if(d%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("정수가 아닙니다");
		}
		
		
		
		System.out.println("-------------------------");
		/*
		 * 4. 서로다른 a,b,c의 최대값을 구하여라
		 */
		int a = 10, b = 20, c = 9; 
		
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else if(b > c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		
		System.out.println("----------------");
		
		
		int max = 0;
		
		if( a > b && a > c) {
			max = a;
		}else {
			if(b > c) {
				max = b;
			}else {
				max = c;
			}
		}
		System.out.println("최대값 : " + max);
		
		
		
		
		
		
		System.out.println("-------------------------");
		/*
		 * 5.숫자가 3 이면 안녕 "3줄", 2이면 "안녕"이 두줄, 1이면 "안녕"이 한 줄, 그 외에는 "잘가"가 되도록 출력
		 */
		int num = 1;
		switch(num) {
			case 3:
				System.out.println("안녕");
			case 2:
				System.out.println("안녕");
			case 1:
				System.out.println("안녕");
				break;
			default:
				System.out.println("잘가");
		}
		
	}
}
