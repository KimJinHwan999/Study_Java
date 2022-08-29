package interfaceobject;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character("주인공");
		
		c.walk();
		c.run();
		c.jump();
		c.attack();
		c.attack();
		c.shield();
		c.pickup();
		
		System.out.println("----------------------");
		
		Monster m = new Monster("몬스터");
		
		m.walk();
		m.attack();
		m.run();
		m.shield();
		m.jump();
	}
}
