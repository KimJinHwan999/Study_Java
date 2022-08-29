package test2;

public class Test02 {
	public static void main(String[] args) {
		/*
		1.

		다음의 for 문을 while 문으로 변경하시오.(10)

		                 for(int i=0; i<=10; i++) {

		                            for(int j=0; j<=i; j++) {

		                                       System.out.print("*");

		                            }

		                            System.out.println();

		                 }

		      }

		}
	*/
		
		
		
		int i = 0;
		
		while(i <= 10) {
			
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		System.out.println("-------------------------");
		
		/*
		 

		2.

		두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.(10)

		[출력 결과]

		1+5=6

		2+4=6

		3+3=6

		4+2=6

		5+1=6
		*/
		
		int dice1 = 0;
		int dice2 = 0;
		
		for(dice1 = 1; dice1 <= 6; dice1++) {
			for(dice2 = 1; dice2 <= 6; dice2++) {
				if(dice1 + dice2 == 6) {
					System.out.println(dice1 + " + " + dice2 + " = " + 6);
					System.out.println();
				}
			}
		}

		System.out.println("-------------------------");
		
		/*
		 

		3.

		방정식 2x+4y=10  의 모든 해를 구하시오.  단 x 와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다. (10)

		[출력 결과]

		x=1, y=2

		x=3, y=1

		x=5, y=0

		 
		*/
		
		int x = 0;
		int y = 0;
		
		for(x = 0; x <= 10; x++) {
			for(y = 0; y <= 10; y++) {
				if(2*x + 4*y == 10) {
					System.out.println("x=" + x + ", " + "y=" + y);
					System.out.println();
				}
			}
		}
		System.out.println("-------------------------");
		
		
		/*
		4.

		배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.(10)

		 

		[배열]

		int[] arr = {10, 20, 30, 40, 50};

		[출력 결과]

		sum=150

		*/
		int[] arr = {10, 20, 30, 40, 50};
		int k = 0;
		int sum = 0;
		
		for(k = 0; k < arr.length; k++) {
			sum += arr[k];
		}
		System.out.println("sum=" + sum);
		System.out.println("-------------------------");
		
		/*
		5.

		2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.(15)

		 

		[배열]

		int[][] arr = {

		{ 5, 5, 5, 5, 5},

		{10,10,10,10,10},

		{20,20,20,20,20},

		{30,30,30,30,30}

		};

		[출력 결과]

		total=325

		average=16
		*/
		int[][] arr1 = {

				{ 5, 5, 5, 5, 5},

				{10,10,10,10,10},

				{20,20,20,20,20},

				{30,30,30,30,30}

				};
		int m = 0;
		int n = 0;
		int sum2 = 0;
		
		for(m = 0; m < arr1.length; m++) {
			for(n = 0; n < arr1[m].length; n++) {
				sum2 += arr1[m][n];
			}
		}
		System.out.println("total=" + sum2);
		System.out.println("average=" + sum2 / (m*n));
		System.out.println("-------------------------");

		 
		/*
		6.

		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 
		단 가능한 한 적은 수의 동전으로 거슬러 주어야한다 (1) 에 알맞은 코드를 넣어서(1줄 이상 일 수 있다.), 프로그램을 완성하시오. (15)

		 

		public class Main01 {

		      public static void main(String[] args) {

		                 // . 큰 금액의 동전을 우선적으로 거슬러 줘야한다

		                 int[] coinUnit = { 500, 100, 50, 10 };

		                 int money = 2680;

		                 System.out.println("money=" + money);

		                 for (int i = 0; i < coinUnit.length; i++) {

		                            (1)

		                 }

		      }

		}

		 

		[출력 결과]

		money=2680

		500원 : 5

		100원 : 1

		50원: 1

		10원 : 3
		*/
		
		int[] coinUnit = { 500, 100, 50, 10 };

        int money = 2680;

        System.out.println("money=" + money);
        
        // 변수를 i 대신 a로 바꿨습니다.
        for (int a = 0; a < coinUnit.length; a++) {
        	int b= 0;
        	while(coinUnit[a] * b <= money) {
        		b++;
        	}
        	money -= coinUnit[a]*(b-1);
        	System.out.println(coinUnit[a] + "원 : " + (b-1));
        	
        }
        System.out.println("-------------------------");
        
		 
		/*
		7.

		num 배열에 저장된 요소의 최대값을 출력하시오.(15)

		 

		[배열]

		int[] num = {94, 85, 95, 88, 90};

		 

		[출력 결과]

		최대값 : 95
		*/
        int[] num = {94, 85, 95, 88, 90};
        int o = 0;
        int p = 0;
        
        for(o = 0; o < num.length; o++) {
        	for(p = 0; p < num.length; p++) {
        		if(num[o] > num[p]) {
        			System.out.println(num[o]);
        		}
        		num[o] = num[p];
        		break;
        	}
//        	System.out.println(num[p]);
        }
        System.out.println("-------------------------");
        
        /*
		8.

		num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오. (15)

		 

		[배열]

		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

		 

		[출력 결과]

		짝수 : 20

		홀수 : 25
		
		*/
        int[] num2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int q = 0;
        int even_sum = 0;
        int odd_sum = 0;
        
        for(q = 0; q < num2.length; q++) {
        	if(num2[q] % 2 == 0) {
            	even_sum += num2[q];
            }else {
            	odd_sum += num2[q];
            	}
        }
        System.out.println("짝수 : " + even_sum);
        System.out.println("홀수 : " + odd_sum);
        
	}
}
