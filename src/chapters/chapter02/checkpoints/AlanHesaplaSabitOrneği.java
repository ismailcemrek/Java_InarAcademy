package chapters.chapter02.checkpoints;

import java.util.Scanner;

public class AlanHesaplaSabitOrneği {

	public static void main(String[] args) {
		
        final double pi = 3.14159;
        
		Scanner girdi = new Scanner(System.in);
		
		double yaricap;
		
		double alan;
		
		// yaricap oku 
		
		System.out.println("Alan hesaplanacak çemberin yarı çapını giriniz: ");
		
		yaricap = girdi.nextDouble();
		
		// alanı hesapla 
		
		alan = yaricap * yaricap * pi;
		
		// alanı yazdır
		
		System.out.println("yaricapi " + yaricap + " olan cemberin alani: " + alan + "dir ");
		
		

	}

}
