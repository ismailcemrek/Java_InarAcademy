package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_07_years {

	

		
		public static void main(String[] args) {
			Scanner klavye = new Scanner(System.in);
			
			System.out.println("Bir dakika Değeri Giriniz: (Ör. Oldukça Büyük Olabilir (234567)");
			
			int girilenDakika = klavye.nextInt();
			
			int yil = girilenDakika / (365 * 24 * 60);
			
			girilenDakika = girilenDakika % ( 365 * 24 * 60 );
			
			int gun = girilenDakika / (24 * 60);
			
		    girilenDakika = girilenDakika % (24 * 60);
		    
		    int saat = girilenDakika / 60;
			
		    girilenDakika = girilenDakika % 60;
		    
		    System.out.println(yil + " yil " + gun + " gün " + saat + " saat " + girilenDakika + " dakikadır ");
			}
	}

