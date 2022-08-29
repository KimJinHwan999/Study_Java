package casting;

public class Main02 {

	public static void main(String[] args) {
		AirForce af = new AirForce("공군");
		Navy nv = new Navy("해군");
		Army am = new Army("육군");
		
		af.bombing();
		nv.nucleus();
		am.tank();
		
		System.out.println("-------------");
		
		Unit temp1 = af;
		Unit temp2 = nv;
		Unit temp3 = am;
		
		temp1.attack();
		temp2.attack();
		temp3.attack();
		
		System.out.println("--------------");
		
		AirForce re1 = (AirForce)temp1;
		Navy re2 = (Navy)temp2;
		Army re3 = (Army)temp3;
		
		re1.bombing();
		re2.nucleus();
		re3.tank();
	}
}
