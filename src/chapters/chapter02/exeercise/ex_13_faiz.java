package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_13_faiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println( " Aylık Biriktirmek İstediğiniz Miktarı Yazınız ");
		
		double paraMiktari = input.nextDouble();
		
		double oran = (1 + 0.00417);
		
     	double aylikDeger = paraMiktari * oran ;
     			
     			aylikDeger = ( paraMiktari + aylikDeger ) * oran;
     			
     			aylikDeger = ( paraMiktari + aylikDeger ) * oran;
     			
     			aylikDeger = ( paraMiktari + aylikDeger ) * oran;
     			
     			aylikDeger = ( paraMiktari + aylikDeger ) * oran;
     			
     			aylikDeger = ( paraMiktari + aylikDeger ) * oran;
     			
     			System.out.println( " Altıncı aydan sonra hesap değeri : " + (int)(aylikDeger * 100) / 100.0 );
     			
     			
     	
     	
     	
     	
		
		
		
		
	}

}
