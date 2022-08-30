package weeks.week_03;

import java.util.Scanner;

public class Yaskiyasla {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Enter the yass of the three friends to determine the oldest and youngest: ");
		
		int yas1 = klavye.nextInt();
		int yas2 = klavye.nextInt();
		int yas3 = klavye.nextInt();
		
		if (yas1 > yas2 && yas1 > yas3){
			System.out.println("Our oldest friend is: " + yas1 + " years old");
		} else if (yas2 > yas1 && yas2 > yas3) {
			System.out.println("Our oldest friend is: " + yas2 + " years old");
		} else {
			System.out.println("Our oldest friend is: " + yas3 + " years old");
		}
		
		if (yas1 < yas2 && yas1 < yas3){
			System.out.println("Our youngest friend is: " + yas1 + " years old");
		} else if (yas2 < yas1 && yas2 < yas3) {
			System.out.println("Our youngest friend is: " + yas2 + " years old");
		} else {
			System.out.println("Our youngest friend is: " + yas3 + " years old");
		}
		
		
		
		
	}

}
