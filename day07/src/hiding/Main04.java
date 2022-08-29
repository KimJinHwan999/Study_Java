package hiding;

public class Main04 {

	public static void main(String[] args) {
		// 객체생성
		Article a = new Article(1, "첫번째 글", "JavaBeans를 학습", "자바학생", 123, "2022-08-16");
		
		// 출력
		System.out.println("글번호 : " + a.getSeq());
		System.out.println("글제목 : " + a.getSubject());
		System.out.println("글내용 : " + a.getContent());
		System.out.println("작성자 : " + a.getWriter());
		System.out.println("조회수 : " + a.getHit());
		System.out.println("작성일시 : " + a.getRegDate());
	}
	
}
