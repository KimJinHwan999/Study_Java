package practice;

public class Main02_while {
	public static void main(String[] args) {
		// while 문으로 1~100까지 더하기
		
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
