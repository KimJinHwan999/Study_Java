package boxing;

public class Main01 {

	public static void main(String[] args) {
		Unit[] unit = new Unit[5];
		
		unit[0] = new AirForce("공군 1호");
		unit[1] = new AirForce("공군 2호");
		unit[2] = new Navy("해군 1호");
		unit[3] = new Army("육군 1호");
		unit[4] = new Army("육군 2호");
		
		unit[0].attack();
		unit[1].attack();
		unit[2].attack();
		unit[3].attack();
		unit[4].attack();
		
		System.out.println("-----------------");
		
		
		for(int i = 0; i < unit.length; i++) {
			
			
			if(unit[i] instanceof AirForce) {
				AirForce re1 = (AirForce)unit[i];
				re1.attack();
				re1.bombing();
			}
			else if(unit[i] instanceof Navy) {
				Navy re2 = (Navy)unit[i];
				re2.attack();
				re2.nucleus();
			}
			else {
				Army re3 = (Army)unit[i];
				re3.attack();
				re3.tank();
			}
		}
	}
}
