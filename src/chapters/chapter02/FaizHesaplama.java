package chapters.chapter02;

import java.util.Scanner;

public class FaizHesaplama {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Yıllık faiz oranını griniz: (Ör. 4.5) ");
		
		double yillikfaizorani = klavye.nextDouble();
		
		System.out.println("Kaç yılda ödemekistiyorsunuz: (Ör. 5) ");
		
		int yil = klavye.nextInt();
		
		System.out.println("Borç alınacak miktar: (Ör. 1567,98 )");
		
		double borcmiktarı = klavye.nextDouble();
		
		double aylikFaizoarani = yillikfaizorani / 1200;
		
		int aylikFaizOrani = 0;
	
		double aylikodememiktari = (borcmiktarı  * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12)));
		
		double toplamBorc = aylikFaizOrani * 12 * yil;
		
		System.out.println("Aylık ödeme miktarı: " + aylikodememiktari);
		
		System.out.println("Toplam ödenecek miktar: " + toplamBorc);
		
		
		
		
				
		
		
		
		
		
		
	}

}
