package chapters.chapter02.exeercise;

import java.util.Scanner;

public class Ex_02_silindirhacmi {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println("yaricap giriniz: ");
		
		System.out.println("yukseklik giriniz: ");
		
		double yaricap = klavye.nextDouble();
		
		double yukseklik = klavye.nextDouble();
		
		System.out.println("Silindirin alanı: " + yaricap * yaricap * Math.PI );
		
		System.out.println("Silindirin hacmi: " + (yaricap * yaricap * Math.PI) * yukseklik);
		
		
		
		
	}

}
