package string;

public class Main03 {

	public static void main(String[] args) {
		
		/*
		 *  주민등록번호에서 생년월일 추출하기
		 *  	- 주민번호 		: 8005011234567 	-> 결과값 : 1980년 05월 01일 남자
		 *  	- 출생년도 판별 	: 1 or 2					-> 19~
		 *  							: 3 or 4					-> 20~
		 *  	- 성별				: 1 or 3					-> 남자
		 *  							: 2 or 4					-> 여자
		 */
		
		String jumin = "8005011234567";
		
		// 주민등록번호를 년, 월, 일 단위로 각 두 글자씩 자르기
		String yy = jumin.substring(0, 2);
		String mm = jumin.substring(2, 4);
		String dd = jumin.substring(4, 6);
		
		// 뒷부분의 첫 번째 글자는 성별코드 이므로 별도로 추출한다.
		String gender_code = jumin.substring(6, 7);
		
		// 태어난 년도 판별
		if( gender_code.equals("1") || gender_code.equals("2") ) {
			yy = "19" + yy;
		}else {
			yy = "20" + yy;
		}
		
		// 기본 성별은 남자
		String gender = "남자";
		
		// 뒷부분 첫 글자가 2, 4인 경우가 여자
		if( gender_code.equals("2") || gender_code.equals("4") ) {
			gender = "여자";
		}
		
		// System.out.printf	-> String.format + System.out.println
		System.out.printf( "%s년 %s월 %s일 %s", yy, mm, dd, gender );
		
		
		
		
		
//		내 풀이
//		String jumin = "8005011234567";
//		
//		int y = Integer.parseInt(jumin.substring(0,2));
//		int m = Integer.parseInt(jumin.substring(2,4));
//		int d = Integer.parseInt(jumin.substring(4,6));
//		int g = Integer.parseInt(jumin.substring(6,7));
//		
//		
//		String yy = "";
//		String gender = "";
//		
//		if(g == 1 || g == 2) {
//			yy = "19" + y;
//		}else{
//			yy = "20" + y;
//		}
//				
//		if(g == 1 || g == 3) {
//			gender = "남자";
//		}else {
//			gender = "여자";
//		}
//	
//		String result = jumin.format("%4s년 %02d월 %02d일 %s",yy, m, d, gender);
//		
//		System.out.println(result);
	}
}
