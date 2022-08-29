package conditional;

import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (C / 60 >= 1) {
			A = A + (C / 60);
			B = B + (C % 60);
			if ( B >= 60 ) {
				B -= 60;
				A += 1;
			}
			if(A >= 24) {
				A-=24;
			}
			
		}else {
			B += C;
			if(B >= 60) {
				B -= 60;
				A += 1;
			}
			if(A >= 24) {
				A-=24;
			}
		}
		
		System.out.println(A + " " + B);
	}
}
