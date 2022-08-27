package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_01_santigrathesaplama {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Santigrat degeri giriniz: ");
		
		int santigrat = klavye.nextInt();
		
		double fahrenayt = ( 9.0 / 5 ) * santigrat + 32;
		
		System.out.println(santigrat + " santigrat = " + fahrenayt + " fahrenayttır. ");
	}
}
