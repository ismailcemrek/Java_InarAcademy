package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_09_ivme {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println( " ilk hızı giriniz  metre / saniye " );
		
		System.out.println( " son hızı giriniz metre / saniye " );
		
		System.out.println( " toplam zamanı giriniz ");
		
		double ilkhiz = input.nextDouble();
		
		double sonhiz = input.nextDouble();
		
		double saniye = input.nextDouble();
		
		double ivme = (sonhiz - ilkhiz) / saniye;
		
		System.out.println(" toplam ivme " + ivme);
	}

}
