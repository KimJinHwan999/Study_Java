package overload;

public class Article {
	// 아티클 클래스 멤버변수 3개
	private int seq;
	private String subject;
	private String writer;
	
	// 파라미터가 있는 생성자 (파라미터를 반드시 3개를 전부 다 받아야만 객체가 생성됨. 
	// 하지만 사용자가 깜빡하고 제목을 기입하지 않아도 객체가 생성되게 해주기 -> 사용자 편의를 위해서)
	// 이 때 무식하게 하나씩 다 써주면 너무 비효율적이니까 this(); 를 이용해서 간단히 한 줄로 적어주기
	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public Article( int seq ) {	// 글 번호만 받아오는 생성자 오버로드
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = "익명"; 
		this(seq, "제목없음", "익명");	// 파라미터가 int, String, String 순서대로 있는 맨 위의 메서드를 호출하게됨
	}
	
	public Article( int seq, String subject ) {
//		this.seq = seq;
//		this.subject = subject;
//		this.writer = "익명";
		this(seq, subject, "익명");
	}

	// toString 메서드
	@Override	// 최상위 클래스인 object로 부터 오버라이드 된 toString() 메서드 이기 때문.
	public String toString() {
		return "Article [seq=" + seq 
				+ ", subject=" + subject 
				+ ", writer=" + writer + "]";
	}
	
	
	
	
	
}
