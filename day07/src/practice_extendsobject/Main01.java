package practice_extendsobject;

public class Main01 {
	public static void main(String[] args) {
		CalcParent CP = new CalcParent();
		CalcChild CC = new CalcChild();
		
		System.out.println(CP.plus(200, 100));
		System.out.println(CP.minus(200, 100));
		System.out.println("-----------------");
		
		System.out.println(CC.plus(200, 100));
		System.out.println(CC.minus(200, 100));
		System.out.println(CC.times(200, 100));
		System.out.println(CC.divide(200, 100));
	}
}
