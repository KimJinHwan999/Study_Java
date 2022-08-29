package interfaceobject;

public class Monster implements Move, Fight{

	private String name;
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(name + " >> 공격");
	}

	@Override
	public void shield() {
		System.out.println(name + " >> 방어");
	}

	@Override
	public void walk() {
		System.out.println(name + " >> 걷기");
	}

	@Override
	public void jump() {
		System.out.println(name +" >> 점프");
	}

	@Override
	public void run() {
		System.out.println(name +" >> 달리기");		
	}

}
