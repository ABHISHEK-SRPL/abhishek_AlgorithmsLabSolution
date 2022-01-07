package com.greatlearning.lab2;
import java.util.*;

public class Main {

	public static void main(String args[]) {
	
			Scanner input = new Scanner(System.in);
	
			System.out.println("Enter the size of transaction array");
	
			int size = input.nextInt();
	
			int array[] = new int[size];
	
			System.out.println("Enter the values of array");
	
			for(int i=0; i < size; i++) 
				array[i]=input.nextInt();
	
			System.out.println("Enter the total no of targets that needs to be achieved");
	
			int target=input.nextInt();
		
			for (int flag=0; target!=0; target--) {
	  
					long finaltarget;
	
					System.out.println("Enter the value of target");
					finaltarget = input.nextInt();
	
					long sum = 0;
	
						for (int i=0; i<size; i++) {
		
								sum += array[i];
		
								if(sum>=finaltarget) {
									System.out.println("Transaction achieved "+(i+1)+" transaction");
		
									flag = 1;
									break;
								}
						}
	
						if (flag == 0) {
							System.out.println("Given target not achieved");
	}
}
	input.close();
   }
}