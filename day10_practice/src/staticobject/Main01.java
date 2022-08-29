package staticobject;

public class Main01 {

	public static void main(String[] args) {
		
		Article.setCategory("게시판");
		
		Article board = new Article(1, "첫 번째 게시물", "2022-08-19");
		Article board1 = new Article(2, "두 번째 게시물", "2022-08-19");
		Article board2 = new Article(3, "세 번째 게시물", "2022-08-19");
		
		System.out.println(board.toString());
		System.out.println(board1.toString());
		System.out.println(board2.toString());
		
	}
}
