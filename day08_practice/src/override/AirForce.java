package override;

public class AirForce extends Unit{
	public AirForce(String name){
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(this.getName() + "<< 공중공격 실행함");
		System.out.println(this.getName() + "<< 이륙");
	}
	
	public void bombing() {
		System.out.println(super.getName() + " << 폭격");
	}
}
