package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_04_pound {

	public static void main(String[] args) {

Scanner klavye = new Scanner(System.in);
		
		System.out.println("Pound degerini giriniz: ");
		
		double pound = klavye.nextDouble();
		
		System.out.println("kilogramdir: " + pound * 0.454 );
		
	}

}
