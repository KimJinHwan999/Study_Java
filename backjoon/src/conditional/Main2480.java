package conditional;

import java.util.Scanner;

public class Main2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int price = 0;
		
		if(dice1 == dice2 && dice1 == dice3) {
			price = 10000 + dice1 * 1000;
		}else if(dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
			int a = Math.max(dice1, dice2);
			int b = Math.max(a, dice3);
			price = b * 100;
		}else {
			int dice = 0;
			if(dice1 == dice2) {
				dice = dice1;
			}else if(dice2 == dice3) {
				dice = dice2;
			}else if(dice1 == dice3) {
				dice = dice1;
			}
			price = 1000 + dice * 100;
		}
		
		System.out.println(price);
	}
}
