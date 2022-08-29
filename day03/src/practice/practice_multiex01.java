package practice;

public class practice_multiex01 {
	public static void main(String[] args) {
		/*
		 *  1. 구구단 7단 결과값만을 출력 
		 *  단, for문으로 작성할 것
		 *  (결과 값 : 7 14 21 ...63)
		 */
		for(int i = 1; i <= 9; i++) {
			int j = 7 * i;
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("--------------");
		/*
		 *  2. 구구단 7단 결과값만을 출력 
		 *  단, while문으로 작성할 것
		 *  (결과 값 : 7 14 21 ...63)
		 */
		int i = 1;
		while(i <= 9) {
			int j = 7 * i;
			i++;
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("--------------");
		/*
		 *  3. 구구단 7단 결과값만을 출력 
		 *  단, do-while문으로 작성할 것
		 *  (결과 값 : 7 14 21 ...63)
		 */
		int j = 1;
		int k = 0;
		do {
			k = 7 * j;
			j++;
			System.out.print(k + " ");
		}while(j <= 9);
		System.out.println();
		System.out.println("--------------");
		
		/*
		 * 4. 1 ~ 100까지 중에 홀수와, 짝수의 합을 각각 구하여라
		 */
		int sum1 = 0;
		int sum2 = 0;
		for(int l = 1; l <= 100; l++) {
			if(l % 2 == 0) {
				sum1 += l;
			}else {
				sum2 += l;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("--------------");
		/*
		 * 5. 구구단 2단부터 9단까지의 결과값만을 출력하여라(2중 반복문)
		 * 단, 단수가 바뀔때마다 구분자를 넣어줄 것
		 */
		int m = 0;
		int n = 0;
		int sum3 = 0;
		for(m = 2; m <= 9; m++) {
			for(n = 1; n <= 9; n++) {
				sum3 = m*n;
				System.out.println(m + "*" + n + "=" + sum3);
			}
			System.out.println("----");
				
		}
		System.out.println("--------------");
		/*
		 * 6. 구구단 2단을 출력하자
		 * ( 2 * 1 = 2
		 * 	 2 * 2 = 4
		 * 	 ..
		 * 	 2 * 9 = 18)
		 */
		int o = 0;
		
		for(o = 1; o <= 9; o++) {
			System.out.println("2" + " * " + o + " = " + 2*o);
		}
		System.out.println("--------------");
		/*
		 * 7. 이중 반복문 (8 * 8)을 사용해서 별을 출력
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 */
		
		for(int q = 1; q <= 8; q++) {
			for(int r=1; r <= 8; r++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("--------------");
		/*
		 * 8. 
		 * 	★★★★★★★★
		 * 	★★★★★★★
		 * 	★★★★★★
		 * 	★★★★★
		 * 	★★★★
		 * 	★★★
		 * 	★★
		 * 	★
		 */
		for(int q = 1; q <= 8; q++) {
			for(int r = q; r <= 8; r++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("--------------");
		/*
		 * 9.
		 * 	★
		 * 	★★
		 * 	★★★
		 * 	★★★★
		 * 	★★★★★
		 * 	★★★★★★
		 * 	★★★★★★★
		 * 	★★★★★★★★
		 */
		for(int q = 1; q <= 8; q++) {
			for(int r = 1; r <= q; r++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("--------------");
		/*
		 * 10. 10번 찍어 안 넘어 가는 나무 없다 라는 문구를 출력
		 * (단, while문으로 작성할 것)
		 * 결과 : 나무를 1번 찍었습니다.
		 * 		 나무를 2번 찍었습니다.
		 * 		 ...
		 * 		 나무를 10번 찍었습니다.
		 * 		 나무가 넘어갔습니다.
		 */
		int treeHit = 1;
		while(treeHit <= 10) {
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");
			treeHit++;
			
		}
		System.out.println("나무가 넘어갔습니다.");
		
	}
}
