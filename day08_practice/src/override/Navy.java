package override;

public class Navy extends Unit{
	public Navy(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " << 해상 공격 실행함");
		System.out.println(super.getName() + " << 어뢰 발사");
		System.out.println(super.getName() + " << 지상 상륙");
	}
	
	public void nuclear() {
		System.out.println(this.getName() + " << 핵미사일");
	}
}
