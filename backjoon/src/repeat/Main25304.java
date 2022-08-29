package repeat;

import java.util.Scanner;

public class Main25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();	//	영수증에 적힌 총 금액
		int N = sc.nextInt();	// 영수증에 적힌 구매한 물건의 종류의 수
		
		int a;
		int b;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
            
			a=sc.nextInt();
			b=sc.nextInt();
			sum += a*b;
		}
        
        sc.close();
        
        if(sum == X) {
			System.out.println("Yes");
		}else if(sum != X){
		    System.out.println("NO");
		}
		
	}
}