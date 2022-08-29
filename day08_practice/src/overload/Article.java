package overload;

public class Article {
	int seq;
	String subject;
	String writer;
	
	
	public Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public Article(int seq) {
		this(seq, "주제없음", "익명");
	}
	
	public Article(int seq, String subject) {
		this(seq, subject, "익명");
	}

	@Override
	public String toString() {
		return "Article [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}
	
	
	
	
}
