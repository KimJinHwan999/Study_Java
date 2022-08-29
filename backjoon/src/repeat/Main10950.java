package repeat;

import java.util.Scanner;

public class Main10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A = 0;
		int B = 0;
		
		int[] TC = new int[T];
		
		for(int i= 0; i < T; i++) {
			A = Integer.parseInt(sc.next());
			B = Integer.parseInt(sc.next());
			TC[i] = A + B;
		}
		
		for(int j = 0; j < T; j++) {
			
			System.out.println(TC[j]);
		}
	
		
		
//		for(int i = 1; i <= T; i++) {
//			System.out.print(A);
//			System.out.print(B);
//			System.out.println(A + B );
//		}
		
		
	}
}
