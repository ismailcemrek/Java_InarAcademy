package chapters.chapter02.exeercise;

import java.util.Scanner;

public class ex_10_enerji {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first temprature value:");
		System.out.println("Enter the last temprature value");
		System.out.println("Enter the amount of water");
		
		double firstTemprature = input.nextDouble();
		double lastTempratur = input.nextDouble();
		double amountWater = input.nextDouble();
		
		double energy = amountWater * (lastTempratur - firstTemprature) * 4184;
		
		System.out.println("The energy required to raise " + firstTemprature + " degrees Celsius of water to " + lastTempratur + " degrees Celsius is " + energy + " joules.");
	}

}
