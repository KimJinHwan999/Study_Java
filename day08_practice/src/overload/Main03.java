package overload;

public class Main03 {

	public static void main(String[] args) {
		Member m  = new Member();
		
		System.out.println(m.toString());
		
		Member m1 = new Member(20);
		System.out.println(m1.toString());
		
		Member m2 = new Member("치과의사");
		System.out.println(m2.toString());
		
		Member m3 = new Member(25, "경비원");
		System.out.println(m3.toString());
		
		Member m4 = new Member("호텔리어", 44);
		System.out.println(m4.toString());
	}
}
