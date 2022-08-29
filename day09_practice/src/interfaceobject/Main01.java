package interfaceobject;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character("주인공");
		Monster m = new Monster("괴물");
		
		c.walk();
		c.attack();
		c.shield();
		c.run();
		c.jump();
		c.pickup();
		m.walk();
		m.run();
		m.jump();
		m.attack();
		m.shield();
	}
}
