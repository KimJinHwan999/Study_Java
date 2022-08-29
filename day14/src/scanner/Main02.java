package scanner;

import java.util.Scanner;

/*
 * scanner.next();				: 공백 전 까지 입력을 받음
 * scanner.nextLine();		: 한 줄 전체를 입력을 받음
 * 
 */

public class Main02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("문자열 입력 : ");
		String str1 = scanner.nextLine();
		System.out.println("nextLine 문자열 출력 : " + str1);
		
		System.out.println("문자열 입력 : ");
		String str2 = scanner.next();
		System.out.println("next 문자열 출력 : " + str2);
		
		
		
		scanner.close();		// 적절한 시점에 close 시켜주는게 좋은 코드이다.
		
		
	}
}
