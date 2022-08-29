package practice;

public class Main03_dowhile {
	public static void main(String[] args) {
		
		// do-while문으로 1부터 100까지 더하기
//		
//		int i = 1;
//		int sum = 0;
//		
//		do {
//			sum += i;
//			i++;
//			
//		}while(i <= 100); 
//			System.out.println(sum);
		
		
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println(sum);
	}
}
