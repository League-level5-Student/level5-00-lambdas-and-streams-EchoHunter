package _01_Lambda_Methods;

import java.util.Iterator;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			System.out.println("");
			for(int i = 1; i <= s.length(); i++) {
				System.out.print(s.charAt(s.length()-i));
			}
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			Random rand = new Random();
			System.out.println("");
			for (int i = 0; i < s.length(); i++){
				if(rand.nextBoolean()) {
					System.out.print(s.charAt(i));
				}else {
					System.out.print(s.toUpperCase().charAt(i));
				}
			}
		}, "randomcapitalization");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			System.out.println("");
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
				System.out.print(".");
			}
		}, "thiswillhaveperiods");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			System.out.println("");
			for(int i = 0; i < s.length(); i++) {
				if((s.charAt(i) != 'a')&&(s.charAt(i) != 'e')&&(s.charAt(i) != 'i')&&(s.charAt(i) != 'o')&&(s.charAt(i) != 'u')&&(s.charAt(i) != 'y'))
				System.out.print(s.charAt(i));
			}
		}, "this contains no vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
