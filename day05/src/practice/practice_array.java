package practice;

public class practice_array {
	public static void main(String[] args) {
		/* 성적표에 대한 2차배열 선언 */
		// 학급 성적을 위한 배열
		int[][] grade = new int[3][3];
		
		grade [0][0] = 75;
		grade [0][1] = 82;
		grade [0][2] = 91;
		grade [1][0] = 88;
		grade [1][1] = 64;
		grade [1][2] = 50;
		grade [2][0] = 100;
		grade [2][1] = 100;
		grade [2][2] = 90;
		
		
		/* 2차 배열을 탐색하여 총점과 평균점수 구하기 */
		// 10시 35분까지 개인 평균, 개인 총점, 2중 for문 사용
		for(int i = 0; i < grade.length; i++) {
			int sum = 0;
			int avg = 0;
			
			for(int j = 0; j < grade[i].length; j++) {
				sum += grade[i][j];
			}
			avg = sum / grade[i].length;
			System.out.println("총점 : " + sum + " ,평균 : " + avg);		
		}
	}
}
