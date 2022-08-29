package override;

public class Unit {
	private String name;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attack() {
		System.out.println(this.getName() + " <<< 공격준비");
	}
	
}
