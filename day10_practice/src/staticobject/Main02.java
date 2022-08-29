package staticobject;

public class Main02 {

	public static void main(String[] args) {
		Calc c = Calc.getInstance();
		int p = c.plus(10, 20);
		System.out.println(p);
		System.out.println(c.minus(20, 10));
	}
}
