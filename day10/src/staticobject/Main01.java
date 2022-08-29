package staticobject;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article a1 = new Article(1, "첫 번째 게시물", "2022-08-18");
		Article a2 = new Article(2, "두 번째 게시물", "2022-08-18");
		Article a3 = new Article(3, "세 번째 게시물", "2022-08-19");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println("---------------------");
		
		Article.setCategory("공지사항");		// static 변수니까 객체 일일이 다 수정할 필요 없고 한 번만 수정해 주면 됨.
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}
