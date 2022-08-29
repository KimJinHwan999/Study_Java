package hiding;

/*
 *  하나의 소스파일에 하나의 public클래스만 존재할 수 있기 떄문에
 *  Member 클래스를 다른 파일로 나누어 놓았다.
 */
public class Member {

	private String name;
	private int age;
	
	
	// 파라미터가 있는 생성자 (자동완성 : 우클릭 -> Source -> Generate Constructor using Fields...)
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}


	// getter, setter (자동완성 : 우클릭 -> Source -> Generate Getters and Setters)
	
	// 왜 getter setter를 이용하여 간접적으로 접근을 하는가?
	/* 
	 * name 과 age라는 두 가지 변수를 받아올 때, age라는 변수의 이름만 봐도 사람 나이를 할당하겠구나 할 것.
	 * 그러나 누군가가 실수로 age에다가 -1 을 입력한다면..?
	 * 프로그래밍 상으로는 -1이 얼마든지 들어갈 수 있지만 실제로는 말이 되지 않는다. (비즈니스 로직 / 업무 로직)
	 * 그러므로 setAge라는 메서드를 통해 간접적으로 접근하여 setAge에다가 조건문을 넣어준다.
	 * (잘못된 데이터가 할당되지 않도록 하는것이 setter의 역할)
	 */
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age >= 0) {			
			this.age = age;
		}else {
			this.age = 0;
		}
	}
	
	
	
	
	
	
	
	
}
