package practice;

public class Main01_for {
	public static void main(String[] args) {
		
		// 1부터 100까지 1씩 증가하며 더하기
		int i = 1;
		int sum = 0;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("i : " + i + " ,sum : " + sum);
			
		}
	}
}
