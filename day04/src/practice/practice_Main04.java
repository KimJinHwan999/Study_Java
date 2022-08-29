package practice;

public class practice_Main04 {
	public static void main(String[] args) {
		// 1 ~ 100 까지 홀수들의 합
		
		int i = 0;
		int sum = 0;
		
		while(true) {
			i++;
			
			if(i % 2 == 0) {
				continue;
			}else if(i > 100) {
				break;
			}else {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
