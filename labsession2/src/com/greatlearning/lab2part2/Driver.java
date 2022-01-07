package com.greatlearning.lab2part2;
import java.util.*;

public class Driver{

	public static void main(String args[]) {
	
		System.out.println("Enter the size of currency denominations");
		Scanner input = new Scanner(System.in);
		
		MergeSort mergesorting = new MergeSort();
		counting countnote = new counting();
		
		int size = input.nextInt();
		int note[] = new int[size];
		
		System.out.println("Enter the currency denomination values");
		
		for (int i=0; i<size; i++) {
			note[i] = input.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = input.nextInt();
		mergesorting.sorting(note, 0, note.length - 1);
		counting.count(note, amount);
		input.close();	}
}