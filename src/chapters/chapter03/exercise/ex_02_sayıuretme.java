package chapters.chapter03.exercise;

import java.util.Scanner;

public class ex_02_sayıuretme {

	public static void main(String[] args) {
 
		
		double a = (int)(Math.random() * 100) ;
		
		double b = (int)(Math.random() * 100) ;

		double c = (int)(Math.random() * 100) ;

		
		System.out.println(a + " + " + b + " + " + c + " sonucunu giriniz " );
		
		Scanner input = new Scanner(System.in);
		
		double sonuc = input.nextDouble(); 
		 
        if (a + b + c == sonuc) {
        	
        	System.out.println("tebrikler dogru bildiniz");
        } else {
        	
        	System.out.println("sonuç yanlış tekrar deneyeniz");
        	
        }
		
		
		
		
	}

}
