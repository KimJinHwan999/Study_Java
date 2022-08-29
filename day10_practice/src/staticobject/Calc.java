package staticobject;

public class Calc {

	private static Calc currents;
	
	public static Calc getInstance() {
		if(currents == null) {
			currents = new Calc();
		}
		return currents;
	}
	
	public static void freeInstance() {
		currents = null;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
}
	
	

