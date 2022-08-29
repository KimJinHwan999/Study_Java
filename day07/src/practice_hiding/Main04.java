package practice_hiding;


public class Main04 {

	public static void main(String[] args) {
		
		Article a = new Article(1, "자바", "자바빈즈에 관한 내용", "자바학생", 123, "2022-08-16");
		
		System.out.println("글번호 : " + a.getSeq());
		System.out.println("글제목 : " + a.getSubject());
		System.out.println("글내용 : " + a.getContent());
		System.out.println("작성자 : " + a.getWriter());
		System.out.println("조회수 : " + a.getHit());
		System.out.println("작성일시 : " + a.getRegDate());
	}
}
