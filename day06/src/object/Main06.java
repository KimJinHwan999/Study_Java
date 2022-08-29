package object;

/*
 * this 키워드를 활용한 멤버변수와 메서드의 접근
 * 	- 멤버변수는 지역변수와 구별하기 위하여 가급적 this를 통하여 접근한다.
 * 	- 메서드는 접근할 때 this 키워드를 사용하는 것이 필수적인 것은 아니다.
 */

class Member{
	String name;
	int age;		// 전역변수 2개 선언
	
	String getName() {
		return this.name;
	} 
	
	void setName( String name ) {
		this.name = name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void say() {
		System.out.println( this.getName() );		
		System.out.println( getAge() );		// 메서드엔 굳이 this는 붙이지 않아도 됨.
	}
	
}

public class Main06 {
	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setName("자바학생");	// 전역변수 setName에 "자바학생" 데이터가 할당됨
		member.setAge(20);			// 전역변수 age에 20 데이터가 할당됨
		member.say();
		
		
	}
}
