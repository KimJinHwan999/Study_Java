package overload;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character();
		
		System.out.println(c.toString());
		c.setProperty(30);
		System.out.println(c.toString());
		c.setProperty("변호사");
		System.out.println(c.toString());
		c.setProperty(20, "의사");
		System.out.println(c.toString());
		c.setProperty("회계사", 34);
		System.out.println(c.toString());
	}
}
