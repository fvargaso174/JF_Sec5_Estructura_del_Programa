package com.sentenciasdecontrol;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = 10, input = 0;
		for (int i = 0; i < numInputs; i++) {
			input = in.nextInt(); // user inputs a number
			if (input % 2 == 0) // if it's even
				continue; // skip the remaining code in the loop, increment i,
//re-check the condition
			System.out.println("That number was odd"); // output only if odd
		} // end for
	}// end method main
}// end class ContinueExample