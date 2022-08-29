package multiex;

public class Main02 {
	public static void main(String[] args) {
		/*
		 * 4. 1 ~ 100까지 중에 홀수와, 짝수의 합을 각각 구하여라
		 */
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {	// 짝수일 때
				sum1 += i;
			}else {				// 홀수일 때
				sum2 += i;
			}
		}
		System.out.println("짝수 : " + sum1);
		System.out.println("홀수 : " + sum2);
		
		
		System.out.println("-----------------------------");
		/*
		 * 5. 구구단 2단부터 9단까지의 결과값만을 출력하여라(2중 반복문)
		 * 단, 단수가 바뀔때마다 구분자를 넣어줄 것
		 */
		int k = 0;
		int l = 0;
		int mul = 0;
		for(k = 2; k <= 9; k++) {
			for(l = 1; l <= 9; l++) {
				mul = k * l;
				System.out.println(k + " x " + l + " = " + mul);
			}
			System.out.println("----------");
		}
		
		
		
		System.out.println("-----------------------------");
		/*
		 * 6. 구구단 2단을 출력하자
		 * ( 2 * 1 = 2
		 * 	 2 * 2 = 4
		 * 	 ..
		 * 	 2 * 9 = 18)
		 */
		int m = 2;
		int n = 0;
		for(n = 1; n <=9; n++) {
			System.out.println(m + " x " + n + " = " + m*n);
		}
		
		
		System.out.println("-----------------------------");
	}
}
