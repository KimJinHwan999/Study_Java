package test03;

public class Calc {

	private String value;

	
	public Calc(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int minus (int x, int y) {
		return x - y;
	}
	
	public int times (int x, int y) {
		return x * y;
	}
	
	public int divide (int x, int y) {
		
		int result = 0;
		
		if(y != 0) {
			return x / y;
		}
		return result;
	}
}
