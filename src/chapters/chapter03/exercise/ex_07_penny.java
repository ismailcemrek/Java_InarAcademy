package chapters.chapter03.exercise;

import java.util.Scanner;

public class ex_07_penny {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount in double, for example 14.14:");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		int numberOfOneHunderedDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of ");

		System.out.println( numberOfOneHunderedDollars + ((numberOfOneHunderedDollars > 1) ? " dollars" : " dollar"));
		System.out.println( numberOfQuarters + ((numberOfQuarters > 1) ? " quarters " : " quarter "));
		System.out.println( numberOfDimes + ((numberOfDimes > 1) ? " dimes " : "  dime"));
		System.out.println( numberOfNickels + ((numberOfNickels > 1) ? " nickels " : "  nickel"));
		System.out.println( numberOfPennies + ((numberOfPennies > 1 ? " pennies " : "  penny")));

	}
	
}


