package override;

public class Army extends Unit {	//	Unit 클래스 (부모클래스)에도 파라미터가 있는 생성자가 있었기 때문에 똑같이 파라미터가 있는 생성자를 만들어줌

	public Army(String name) {
		super(name);
	}
	
	// override 메서드
	// 공격의 형태를 육군에 맞게 변경하지만, 부모클래스가 가지고 있는
	// 공격 준비 기능을 super 키워드를 사용해서 호출하려고 함
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 지상공격 실행함");
	}
	
	public void tank() {	// 아미 클래스 만의 메서드 '탱크'
		System.out.println(super.getName() + " >> 탱크 공격");
	}
}
