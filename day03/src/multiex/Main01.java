package multiex;

public class Main01 {
	public static void main(String[] args) {
		/*
		 *  1. 구구단 7단 결과값만을 출력 
		 *  단, for문으로 작성할 것
		 *  (결과 값 : 7 14 21 ...63)
		 */
		int i = 0;
		int j = 0;
		
		for(i = 1; i <= 9; i++) {
			j = 7 * i;
			System.out.println("7 * " + i + " = " + j);
		}
		
		
		System.out.println("-----------------------------");
		/*
		 *  2. 구구단 7단 결과값만을 출력 
		 *  단, while문으로 작성할 것
		 *  (결과 값 : 7 14 21 ...63)
		 */
		int k = 0;
		int l = 0;
		while(k < 9) {
			k++;
			l = 7 * k;
			System.out.println("7 * " + k + " = " + l);
			
		}
		
		
		System.out.println("-----------------------------");
		/*
		 *  3. 구구단 7단 결과값만을 출력 
		 *  단, do-while문으로 작성할 것
		 *  (결과 값 : 7 14 21 ...63)
		 */
		int m = 0;
		int n = 0;
		do {
			m++;
			n = 7 * m;
			System.out.println("7 * " + m + " = " + n);
		}while(m < 9);
		
		
		System.out.println("-----------------------------");
	}
}
