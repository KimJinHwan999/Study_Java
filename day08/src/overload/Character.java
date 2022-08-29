package overload;

	// character라는 이름의 class 생성
public class Character {
	// character라는 이름의 class에 private 멤버변수 두 개 선언
	private String job;
	private int age;
	
	// 메서드 프로퍼티 정의 (job)
	public void setProperty( String job ) {
		this.job = job;
	}
	
	// 메서드 프로퍼티 정의 (age)
	public void setProperty( int age ) {
		this.age = age;
	}
	
	// -> 동일한 이름의 메서드 (setProperty)를 파라미터를 다르게 하여 설정
	
	public void setProperty( String job, int age ) {
		this.job = job;
		this.age = age;
	}
	
	public void setProperty( int age, String job ) {
		this.age = age;
		this.job = job;
	}
	
	public String toString() {
		return "Character [ job = " + this.job + ", age = " + this.age + " ]";
	}
}
