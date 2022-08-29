package abstractobject;

public class Navy extends Unit {

	public Navy(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(getName() + ">>해상공격개시");
	}

	@Override
	public void move() {
		System.out.println(getName() + ">>해상공격개시");
	}


}
