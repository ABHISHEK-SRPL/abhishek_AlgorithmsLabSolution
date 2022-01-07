package com.greatlearning.lab2part2;

public class counting {

	public static void count(int note[], int amount){
	
		int countings[] = new int[note.length];
		
		try {
			for( int i = 0; i < note.length; i++) {
				if(amount >= note[i]) {
				countings[i] = amount /note[i];
				amount = amount - countings[i] * note[i];
			}
		}
			if (amount > 0) {
			System.out.println("Exact amount cannot be given with the highest denomination");}
		else {System.out.println("Your payment approach in order to give min no of notes wil be");
		
		for (int i =0; i < note.length; i++) {
				if(countings[i] != 0) {
					System.out.println(note[i] + " : " + countings[i]);
				}
			}
		}
	} catch (ArithmeticException except) {
		System.out.println(except + " Notes of denomination 0 is invalid");
		}
	}
}