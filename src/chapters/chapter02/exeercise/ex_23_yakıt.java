package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_23_yakıt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;
		
		System.out.println( " mesafeyi giriniz " );
		
		double mesafe = input.nextDouble();
		
		System.out.println (" mil başına kullanılan galonu giriniz ");
		
		double galon = input.nextDouble();
		
		System.out.println( " galon fiyatını giriniz " );
		
		double galonfiyatı = input.nextDouble();
		
		double fiyat = (mesafe / galon) * galonfiyatı ; 
		
		System.out.println( " yakıt maliyetiniz : " + (int)(fiyat * 100)/100.0 );
		
		
		
		
		
		
	}

}
