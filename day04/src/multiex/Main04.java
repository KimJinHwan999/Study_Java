package multiex;

public class Main04 {
	public static void main(String[] args) {
		// 1 ~ 100 까지 홀수들의 합
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			i++;
			
			if( i % 2 == 0 ) {	// 짝수
				continue;		// 짝수면 다시 true로 올라감
			}
			if ( i > 100 ) {
				break;			// 반복문을 깸
			}
			
			sum += i;			// 홀수인 경우 & 100보다 작은경우 누적합
		}
		
		System.out.println(sum);
	}
}
