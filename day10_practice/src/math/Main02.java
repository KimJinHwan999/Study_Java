package math;

public class Main02 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println();
	}
	
	public static int random(int min, int max) {
			int num = (int)(Math.random() * (max - min + 1) + min);
			return num;
	}
}
