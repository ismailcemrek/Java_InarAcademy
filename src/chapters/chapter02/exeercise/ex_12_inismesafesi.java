package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_12_inismesafesi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println( " ilk hizi giriniz ");
		
		System.out.println( " ivmeyi giriniz ");
		
		double ilkhiz = input.nextDouble();
		
		double ivme = input.nextDouble();
		
		double uzunluk = (ilkhiz * ilkhiz) / (2 * ivme);
		
		System.out.println("bu uçak için minimum pist uzunluğu: " + (int)(uzunluk * 1000) / 1000.0);
		
		

		
		

	}

}
