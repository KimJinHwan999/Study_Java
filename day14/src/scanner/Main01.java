package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print( "int type 입력 : " );
		int i = scanner.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.print("String 입력 : ");
		String s = scanner.next();
		System.out.println("String 결과 : " + s);
		
		scanner.close();		// inputStream이기 때문에 마지막엔 꼭 닫아줘야함
	}
}
