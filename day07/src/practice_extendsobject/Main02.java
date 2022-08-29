package practice_extendsobject;

public class Main02 {
	public static void main(String[] args) {
		
		QNAArticle qna = new QNAArticle();
		FileArticle fart = new FileArticle();
		
		qna.setNum(1);
		qna.setTitle("첫번째 질문입니다");
		qna.setAnswer("첫번째 답변입니다");
		System.out.println(qna.toString());
		System.out.println("-------------");
		fart.setNum(1);
		fart.setTitle("첫번째 자료입니다");
		fart.setFileName("자바.ppt");
		System.out.println(fart.toString());
		
	}
}
