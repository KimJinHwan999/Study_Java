package test04;

public class Main {
	
	public static void main(String[] args) {
		
		Student st = new Student("자바학생", 3, 15, 66, 79, 92);

		
		
		System.out.println("kor, eng, math의 총합 : " + st.sum() + "점");
		System.out.println("kor, eng, math의 평균값 : " + st.avg() + "점");
		
		System.out.println(st.toString());
		
	}
	

}
