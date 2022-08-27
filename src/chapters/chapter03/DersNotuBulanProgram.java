package chapters.chapter03;

import java.util.Scanner;

public class DersNotuBulanProgram {

	private static final String Ders = null;

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Ders puaniniz giriniz: (0 ile 100 arasinda)");
		
		int derspuan = klavye.nextInt();
		
		if (derspuan >= 90) {
			
			System.out.println("Ders notunuz A");
			
		} else if (derspuan >= 80) {
		
			System.out.println("Ders notunuz B");
			
		} else if (derspuan >= 70) {
		
			System.out.println("Ders notunuz C");
			
		} else if (derspuan >= 60) {
		
			System.out.println("Ders notunuz D");
			
		} else {
			
			System.out.println("Ders notunuz F");
			
		}
	}
}
