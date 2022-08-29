package practice;

public class practice_array {
	public static void main(String[] args) {
		// 배열의 선언과 크기 지정 및 값에 할당에 대한 개별 처리
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
		
		int[] michole = {80, 90, 70};
		
		
		
		/* 배열의 활용 */
		// 반복문을 활용하여 각각의 총합, 평균 출력까지
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		for(int i = 0; i < dooly.length; i++) {
			sum1 += dooly[i];
		}
		System.out.println("둘리 총합 : " + sum1);
		System.out.println("둘리 평균 : " + sum1 / dooly.length);
		
		for(int j = 0; j < douneo.length; j++) {
			sum2 += douneo[j];
		}
		System.out.println("도우너 총합 : " + sum2);
		System.out.println("도우너 평균 : " + sum2 / douneo.length);
		
		for(int k = 0; k < ddochy.length; k++) {
			sum3 += ddochy[k];
		}
		System.out.println("또치 총합 : " + sum3);
		System.out.println("또치 평균 : " + sum3 / ddochy.length);
		
		for(int l = 0; l < michole.length; l++) {
			sum4 += michole[l];
		}
		System.out.println("마이콜 총합 : " + sum4);
		System.out.println("마이콜 평균 : " + sum4 / michole.length);
	}
}
