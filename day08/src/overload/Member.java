package overload;

public class Member {
	// Member 라는 이름의 class에 선언된 두 개의 멤버변수 job과 age
	private String job;
	private int age;
	
	// 기본 생성자
	public Member() {
		
	}
	
	// 생성자 오버로딩
	public Member( int age ) {
		this.age = age; // 파라미터로 받은 age 값을 멤버변수 private int age로 보내줌
	}
	
	public Member( String job ) {
		this.job = job;
	}
	
	public Member(String job, int age) {
		this.job = job;
		this.age = age;
	}
	
	public Member(int age, String job) {
		this.age = age;
		this.job = job;
	}

	@Override
	public String toString() {	// 자바 최상위 클래스 object에 정의되어 있는 메서드인 toString
		return "Member [job=" + job + ", age=" + age + "]";
	}
	
	
}
