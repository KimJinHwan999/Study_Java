package loop;

public class Main01 {
	public static void main(String[] args) {
		// for문 연습
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
			System.out.println("i : " + i + ", sum : " + sum);
		}
		
		System.out.println(sum);
	}
}
