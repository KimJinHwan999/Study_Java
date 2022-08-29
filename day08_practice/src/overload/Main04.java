package overload;

public class Main04 {

	public static void main(String[] args) {
		Article a = new Article(1);
		System.out.println(a.toString());
		
		Article a1 = new Article(2, "자바");
		System.out.println(a1.toString());
		
		Article a2 = new Article(2, "자바", "자바학생");
		System.out.println(a2.toString());
	}
}
