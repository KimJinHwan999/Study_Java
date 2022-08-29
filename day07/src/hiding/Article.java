package hiding;

// javaBeans
public class Article {
	
	private int seq;		// 글번호
	private String subject;	// 글제목
	private String content;	// 글내용
	private String writer;	// 작성자
	private int hit;		// 조회수
	private String regDate;	// 작성일시
	
	// 파라미터가 있는 생성자
	public Article(int seq, String subject, String content, 
			String writer, int hit, String regDate) {
		
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
		
	}
	
	// 전역변수 getter, setter
	
	int getSeq() {
		return seq;
	}
	
	void setSeq(int seq) {
		this.seq = seq;
	}
	
	String getSubject() {
		return subject; 
	}
	
	void setSubject(String subject) {
		this.subject = subject;
	}
	
	String getContent() {
		return content;
	}
	
	void setContent(String content) {
		this.content = content;
	}
	
	String getWriter() {
		return writer;
	}
	
	void setWriter(String writer) {
		this.writer = writer;
	}
	
	int getHit() {
		return hit;
	}
	
	void setHit(int hit) {
		this.hit = hit;
	}
	
	String getRegDate() {
		return regDate;
	}
	
	void setRegdate(String regDate) {
		this.regDate = regDate;
	}
}













