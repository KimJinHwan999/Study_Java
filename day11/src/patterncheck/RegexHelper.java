package patterncheck;

import java.util.regex.Pattern;

public class RegexHelper {

	// 싱글톤 객체 생성
	private static RegexHelper rh;
	
	public static RegexHelper getInstance() {
		if(rh == null) {
			rh = new RegexHelper();
		}
		return rh;
	}
	
	public static void freeInstance() {
		rh = null;
	}
	
	private RegexHelper() {}
	/*
	 * 메서드 1.
	 * 주어진 문자열이 공백이거나 null인지 검사
	 * @param		str 			- 검색할 문자열
	 * @return		boolean		- 공백, null이 아닐 경우 true 리턴
	 */
	public String blank(String blank) {
		
		if( blank == null || blank == "" ) {
			System.out.println("값을 입력해주세요");
			return "false";
		}
		return "true";
	}
	
	/*
	 * 메서드 2.
	 * 숫자 모양에 대한 형식 검사
	 * @param		str				- 검사할 문자열
	 * @return 		boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public String num(String num) {
		boolean isNum = Pattern.matches("^[0-9]*$", num);
		
		if( !isNum ) {
			System.out.println("숫자로만 입력하세요");
			return "false";
		}
			return "true";
	}
	/*
	 * 메서드 3.
	 * 영문으로만 구성되었는지에 대한 형식 검사
	 * @param		str 			- 검사할 문자열
	 * @return		boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false 
	 */
	public String eng(String eng) {
		boolean isEng = Pattern.matches("^[a-zA-Z]*$", eng);
		
		if( !isEng ) {
			System.out.println("영문으로만 입력하세요");
			return "false";
		}
			return "true";
	}
	
	/*
	 * 메서드 4.
	 * 한글로만 구성되었는지에 대한 형식 검사
	 * @param		str 			- 검사할 문자열
	 * @return		boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false 
	 */
	
	public String kor(String kor) {
		boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", kor);
		
		if( !isKor ) {
			System.out.println("한글로 입력하세요");
			return "false";
			
		}	 
		return "true";
	}
	
	/*
	 * 메서드 5.
	 * 영문과 숫자로만 구성되었는지에 대한 형식 검사
	 * @param		str 			- 검사할 문자열
	 * @return		boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false 
	 */
	
	public String eng_num(String eng_num) {
		boolean isEng_Num = Pattern.matches("^[a-zA-Z0-9]*$", eng_num);
		
		if( !isEng_Num ) {
			System.out.println("영문이나 숫자로만 입력하세요");
			return "false";
		}
		return "true";
	}
	
	public String email(String email) {
		boolean isEmail = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email);
		
		if( !isEmail ) {
			System.out.println("이메일 형식으로만 입력하세요");
			return "false";
		}
		return "true";
	}
}
