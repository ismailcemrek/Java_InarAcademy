package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_21_gerido {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println( " Yatırım Yapmak İstediğiniz Miktarı Giriniz " );
		
		double paraMiktari = input.nextDouble();
		
		double aylikFaizOranı = ( 1 + 0.00375);
		
        double yatiriminGeriDonusDegeri = paraMiktari * aylikFaizOranı * 1 * 12 ;	
        
        System.out.println( " 1 yıl sonraki paranızın degeri : " + (int)paraMiktari * aylikFaizOranı * 1 * 12) ;
        
        
		
		
		
		
		
				
	}

}
