package condition;

public class Main07 {
	public static void main(String[] args) {
		
		char grade = 'D';
		
		/*
		 * grade가 A 또는 B 또는 C일 경우 : pass
		 * 그 외 : Not-pass
		 * 
		 */
		
		switch(grade) {
		case 'A':
			System.out.println("pass");
			break;
		case 'B':
			System.out.println("pass");
			break;
		case 'C':
			System.out.println("pass");
			break;
		default:
			System.out.println("Not-pass");
			break;
		}
		
		switch(grade) {
		case 'A','B','C':
			System.out.println("pass");
			break;
		default:
			System.out.println("Not-pass");
			break;
		}
		
		switch(grade) {
		case'A':
		case'B':
		case'C':
			System.out.println("Pass");
			break;
		default:
			System.out.println("Not-pass");
			break;
			
		}
	}
}
