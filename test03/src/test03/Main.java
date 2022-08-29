package test03;

public class Main {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("-----------------------");
		
		Calc calc = new Calc("calc");
		System.out.println(calc.getValue());
		
		System.out.println("-----------------------");
		
		System.out.println("plus 결과 = " + calc.plus(x, y) 
		+ ", minus 결과 = " + calc.minus(x, y));
		
		System.out.println("times 결과 = " + calc.times(x, y) 
		+ ", divide 결과 = " + calc.divide(x, y));
		
	}
}
