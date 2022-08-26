package chapters.chapter02.checkpoints;

import java.util.Scanner;

public class ZamaniGoster {

	public static void main(String[] args) {

		System.out.println("Saniye cinsnden bir tam sayı giriniz: ");
		
		Scanner klavye = new Scanner(System.in);
		
		int saniye = klavye.nextInt();
		
		int dakika = saniye / 60;
		
		int kalansaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalansaniye + " saniyedir ");
		
		
	}

}
