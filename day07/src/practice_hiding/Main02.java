package practice_hiding;

class Student{
	private String name;
	private int age;
	
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
		this.age = age;
	}
	
	public String toString() {
		
		return getAge() + getName();
	}
}


public class Main02 {
	public static void main(String[] args) {
		// getter setter
		Student st = new Student();
		st.setName("자바학생");
		st.setAge(20);
		
		System.out.println(st.toString());
		
		
		
	}
}
