package weeks.week_03;

import java.util.Random;
import java.util.Scanner;

public class DortHaneliSayi {

	public static void main(String args[]){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("dört haneli bir sayi giriniz: ");
		
		int mainNumber = klavye.nextInt();
		
		int sayi1 = mainNumber % 10;
		int sayi2 = (mainNumber/10) % 10;
		int sayi3 = (mainNumber/100) % 10;
		int sayi4 = mainNumber/1000;
		
		System.out.println(sayi1 * 1000 + sayi2 * 100 + sayi3 * 10 + sayi4);

	}

}