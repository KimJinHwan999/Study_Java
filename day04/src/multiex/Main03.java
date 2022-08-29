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
		for(k = 0; k <= 7; k++) {
			for(l = k; l <= 7; l++) {	// l이 0일 때 -> k는 0~ 7 (8번) 반복, l이 1일 때 k는 1 ~ 7 (7번) 반복 ...
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
		for(m = 7; m >= 0; m--) {
			for(n = m; n <= 7; n ++) {	// n 이 7일 때 -> m은 7 (1번) 반복, n이 6일 때 -> m은 6 ~ 7 (2번) 반복, n이 5일 때 -> m은 5 ~ 7 (3번) 반복   
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
			
			if(o == 10) {				
				
				System.out.println("나무가 넘어갔습니다.");
			}
		}
	}
}
