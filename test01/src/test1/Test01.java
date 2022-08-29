package test1;

public class Test01 {
	public static void main(String[] args) {
		/*
		1.

		1 부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.(코드작성)(35)
		 */
		 
		int i = 0;
		int sum = 0;
		
		for(i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		/* 
		2.

		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오

		코드작성)(35)

		답변		
		*/
		int j = 0;
		int sum2 = 0;
		int total = 0;
		
		
		for(j = 1; j <= 10; j++) {
			sum2 += j;
			total += sum2;
		}
		System.out.println(total);
	}
}
