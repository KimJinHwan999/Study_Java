package boxing;

public class Main01 {

	/*
	 * 부모 클래스에 대한 객체 배열을 생성하고 배열의 요소에 자식 클래스 객체를 할당하면
	 * 자동으로 암묵적 형 변환이 이루어진다. 
	 */
	public static void main(String[] args) {
		// 부대지정
		
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군 1호");
		units[1] = new AirForce("공군 2호");
		units[2] = new Navy("해군 2호");
		units[3] = new Army("육군 1호");
		units[4] = new Army("육군 2호");
		
		for(int i = 0; i < units.length; i++) {
			units[i].attack();
			
			// instanceof 
			
			if(units[i] instanceof AirForce) {
				AirForce af = (AirForce) units[i];
				af.bombing();
			}else if(units[i] instanceof Navy) {
				Navy nv = (Navy) units[i];
				nv.nucleus();
			}else {
				Army am = (Army)units[i];
				am.tank();
			}
			System.out.println("--------------------");
		}
			
			
			
//			if(units[i] instanceof Navy) {
//				Navy temp2 = (Navy) units[i];
//				temp2.nucleus();
//			}
//			
//			if(units[i] instanceof Army) {
//				Army temp3 = (Army)units[i];
//				temp3.tank();
//			}
			
	}
		
		
}

