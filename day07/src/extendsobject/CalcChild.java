package extendsobject;

// 상속은 클래스 하나밖에 안 됨
public class CalcChild extends CalcParent {

	public int times(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		int result = 0;
		
		if(y != 0) {
			result =  x / y;			
		}
		return result;
	}
}
