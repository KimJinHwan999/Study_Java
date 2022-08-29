package override;

public class Unit {		// 부모클래스
	
	private String name;
	
	

	public Unit(String name) {	//	파라미터가 있는 생성자
		super();				//	이 자체가 부모클래스임에도 불구하고 super()가 자동적으로 메서드처럼 사용됨.(최상위 클래스 => object) -> 없어도 자바 컴파일러가 알아서 넣어줄 것. 
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attack() {
		System.out.println(this.name + " >>> 공격준비");
	}
	
}
