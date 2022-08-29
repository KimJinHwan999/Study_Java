package calendar;

import java.util.Calendar;

public class Main06 {

	public static void main(String[] args) {
		// 2시까지
		// 8월달 달력 만들기(행과 열 -> 2차배열)
		// 캘린더클래스 이번달 몇 주로 되어있는지? 	-> 행 해결
		// 월화수목금토일 7일 (하드코딩해도 괜찮음)	-> 열 해결
		Calendar cal = Calendar.getInstance();
		
		int day = cal.get(Calendar.DAY_OF_WEEK); // 주의 일 -> get으로 불러오기 => 오늘에 해당하는 요일 인덱스
		String[] day_name = {"일", "월", "화", "수", "목", "금", "토"};
		
		
		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);	// 달의 주 -> 최대수의 주 = 몇주?
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);	// 달의 날 -> 최대수의 날 = 마지막일
		cal.set(Calendar.DAY_OF_MONTH, 1);	//	달의 1일로 달력의 요일을 지정
		int first_day = cal.get(Calendar.DAY_OF_WEEK);		// 달의 1일로 지정된 달력이 가리키는 첫 날의 인덱스
		
		
		int[][] month = new int[week_count][day_name.length];

		
		
		
		/*
		 * 
		month[0][first_day]		= 1;
		month[0][first_day + 1] = 2;
		month[0][first_day + 2] = 3;
		
		month[0][first_day + 5] = 6;
		
		month[1][first_day - 1] = 7;
		month[1][first_day]		= 8;
		*/
		int i =0;
		int j = first_day;
		int k = 1;
		for(i = 0; i < week_count; i++) {
			
			for(j = first_day; j < 7; j++) {
				month[i][j] = k++;
				
			}
			System.out.println(month[1][0]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
