package math;

import study.java.helper.Util;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * Util class에 정의되어 있는 random() 메서드를 사용해서
		 * 5자리 인증번호를 생성
		 * 	ex) 11289, 26894, 11134 
		 */
		String authNum = "";
		
		for( int i = 0; i<5; i++ ) {
			authNum += Util.getInstance().random(0, 9);
		}
		
		System.out.println("인증번호 : " + authNum);
		
//		Util ran = Util.getInstance();
//		System.out.println("인증번호 : " + ran.random(10000,99999));
	}
}
