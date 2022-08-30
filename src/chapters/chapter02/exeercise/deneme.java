package chapters.chapter02.exeercise;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println("enter your year of service: " );
		
		double calismaYili = klavye.nextInt();
		
		double yillikMaas =  10000;
		
		
		
		if (calismaYili > 5) {
			
			System.out.println(yillikMaas + (yillikMaas * 5) / 100 );
			
			
			
	}  else { 
		
		System.out.println(yillikMaas);
		
		
		
		
	}
	}

}
