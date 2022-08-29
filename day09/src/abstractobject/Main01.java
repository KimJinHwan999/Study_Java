package abstractobject;

public class Main01 {

	public static void main(String[] args) {
		Army am = new Army("육군");
		
		am.attack();
		am.move();
		
		Navy nv = new Navy("해군");
		 
		nv.attack();
		nv.move();
		
		AirForce af = new AirForce("공군");
		
		af.attack();
		af.move();
		
		
	}
}
