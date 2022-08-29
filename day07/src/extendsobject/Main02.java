package extendsobject;

public class Main02 {

	public static void main(String[] args) {
		
		FileArticle fart = new FileArticle();
		fart.setNum(1);
		fart.setTitle("첫 번째 자료입니다");
		fart.setFileName("java.ppt");
		
//		원래 같으면 아래 세 줄을 쳐야 했지만, toString을 정의해 놓은 덕분에 한 줄로 깔끔하게 정리 가능.
//		System.out.println(fart.getNum());
//		System.out.println(fart.getTitle());
//		System.out.println(fart.getFileName());
		
		System.out.println(fart.toString());
		System.out.println("----------------------------");
		
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("첫 번째 질문입니다");
		qna.setAnswer("첫 번째 답변입니다");
		System.out.println(qna.toString());
	}
}
