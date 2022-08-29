package multiex;

public class Main03 {
	public static void main(String[] args) {
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
		int i = 0;
		int j = 0;
		for(i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("-----------------------------");
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
		int k = 0;
		int l = 0;
		for(k = 1; k <= 8; k++) {
			for(l = 1; l <= 9-k; l++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
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
		int m = 0;
		int n = 0;
		for(m = 1; m <= 8; m++) {
			for(n = 1; n <= m; n ++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("-----------------------------");
		/*
		 * 10. 10번 찍어 안 넘어 가는 나무 없다 라는 문구를 출력
		 * (단, while문으로 작성할 것)
		 * 결과 : 나무를 1번 찍었습니다.
		 * 		 나무를 2번 찍었습니다.
		 * 		 ...
		 * 		 나무를 10번 찍었습니다.
		 * 		 나무가 넘어갔습니다.
		 */
		int o = 0;
		
		while(o < 10) {
			o++;
			System.out.println("나무를 " + o + "번 찍었습니다.");
		}
		System.out.println("나무가 넘어갔습니다.");
	}
}
