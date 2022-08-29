package abstractobject;

/*
 * 추상 클래스를 상속받으면 자식은 부모의 모든 추상 메서드를 재정의 해야 한다.
 */
public class Army extends Unit{
	
	public Army(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(this.getName() + " >> 육상공격");
	}
	
	@Override
	public void move() {
		System.out.println(this.getName() + " >> 육상이동");
	}
	
	// Navy class 생성, extends Unit
	// AirForce class 생성, extends Unit	
	// Main class 생성, 육 / 해 / 공 객체 생성, attack(), move() 호출
}
