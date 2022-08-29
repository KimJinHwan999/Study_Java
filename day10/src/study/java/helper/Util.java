package study.java.helper;

/*
 * 기본적으로 공통 기능들을 묶어 놓은 클래스
 */
public class Util {
	// -- 싱글톤 객체
	private static Util u;
	
	public static Util getInstance() {
		if(u == null) {
			u = new Util();
		}
		return u;
	}
	
	public static void freeInstance() {
		u = null;
	}
	
	private Util() {}
	
	
	// random(a,b)
	/*
	 * 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	 * @param	min : 범위 안에서의 최솟값
	 * @param	max : 범위 안에서의 최댓값
	 * @return		: min ~ max 안에서의 랜덤값
	 */
	public int random(int min, int max) {
		int num =  (int)((Math.random() * (max - min + 1)) + min);
		return num;	
	}
	
}
