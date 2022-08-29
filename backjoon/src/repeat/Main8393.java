package repeat;

import java.util.Scanner;

public class Main8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		for(i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
