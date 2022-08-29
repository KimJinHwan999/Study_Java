package practice_extendsobject;

public class QNAArticle extends Article{
	String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toString() {
		return "QNAArticle [ 글제목 : " + getTitle() + ", 글번호 : " + getNum() + 
				", 답변 : " + answer + " ]";
	}
}
