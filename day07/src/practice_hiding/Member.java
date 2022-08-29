package practice_hiding;

public class Member {
	String name;
	int age;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}else {			
			this.age = 0;
		}
	}
}
