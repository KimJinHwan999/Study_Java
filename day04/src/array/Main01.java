package array;

public class Main01 {
	public static void main(String[] args) {
		/* 배열의 생성 */
		// 배열의 선언과 크기 지정 및 값의 할당에 대한 개별 처리
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// 배열의 선언과 크기 지정의 일괄처리
		int[] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
		// 배열 생성의 일괄처리
		int[] ddochy = new int[] {100, 100, 90};
		
		
		
		/* 배열의 활용 */
		// 반복문을 활용하여 각각의 총합, 평균 출력까지
//		double x = 0;
//		double sum = 0;
//		double aver = 0;
//		
//		for(int i = 0; i < dooly.length; i ++) {
//			x = dooly[i];
//			sum += x;
//			aver = sum / dooly.length;
//		}
//		System.out.println("둘리 점수 총합 : " + sum);
//		System.out.println("둘리 점수 평균 : " + aver);
//		System.out.println("------------------------");
//		
//		
//		double y = 0;
//		double sum2 = 0;
//		double aver2 = 0;
//		
//		for(int j = 0; j < douneo.length; j++ ) {
//			y = douneo[j];
//			sum2 += y;
//			aver2 = sum2 / douneo.length;
//		}
//		System.out.println("도우너 점수 총합 : " + sum2);
//		System.out.println("도우너 점수 평균 : " + aver2);
//		System.out.println("------------------------");
//		
//		double z = 0;
//		double sum3 = 0;
//		double aver3 = 0;
//		
//		for(int k = 0; k < ddochy.length; k++ ) {
//			z = ddochy[k];
//			sum3 += z;
//			aver3 = sum3 / ddochy.length;
//		}
//		System.out.println("또치 점수 총합 : " + sum3);
//		System.out.println("또치 점수 평균 : " + aver3);
//		System.out.println("------------------------");
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		for (int i = 0; i < dooly.length; i++ ) {
			sum1 += dooly[i];
		}
		System.out.println("둘리 총 합 : " + sum1);
		
		for (int i = 0; i < douneo.length; i++ ) {
			sum2 += douneo[i];
		}
		System.out.println("도우너 총 합 : " + sum2);
		
		for (int i = 0; i < ddochy.length; i++ ) {
			sum3 += ddochy[i];
		}
		System.out.println("또치 총 합 : " + sum3);
		
		// 평균
		System.out.println( "둘리 평균 : " + sum1 / dooly.length );
		System.out.println( "도우너 평균 : " + sum2 / douneo.length );
		System.out.println( "또치 평균 : " + sum3 / ddochy.length );
	}
}
