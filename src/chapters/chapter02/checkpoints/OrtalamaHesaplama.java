package chapters.chapter02.checkpoints;

import java.util.Scanner;

public class OrtalamaHesaplama {
	public static void main(String[] args) {
		Scanner ahmet = new Scanner(System.in);
		
		System.out.println("Ortalama hesaplamak için üç sayı giriniz");
		
		Double sayi1 = ahmet.nextDouble();
		Double sayi2 = ahmet.nextDouble();
		Double sayi3 = ahmet.nextDouble();
		
		Double ortalama = (sayi1 + sayi2 + sayi3) / 3;
		
		System.out.println("Girilen üç sayının ortalaması: " + ortalama);
				
		
		
	}
	


}
