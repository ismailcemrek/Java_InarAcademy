package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_06_tamsayi {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println(" 0 ile 100 arasında bir sayı giriniz ");

		int sayi = klavye.nextInt() ;
		
        int birlerBasamagı = sayi % 10;
		
		int onlarBasamagı = (sayi / 10) % 10;
	
		int yuzlerBasamagi = sayi / 100;
		
		int toplam = birlerBasamagı + onlarBasamagı + yuzlerBasamagi;

		System.out.println(sayi + " Sayısının Basamak Değerleri Toplamı: " + toplam + " dır");

		
		
		
	}

}
