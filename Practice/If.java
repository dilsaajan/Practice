package com.dilsaajan.practice;

import java.util.Scanner;//Import scanner object

public class If {
	public static void main(String args[]){
		
		String favFood; //String variable
		
		Scanner inp = new Scanner(System.in);//Make a new scanner named inp, take in the system input (Keyboard)
		
		System.out.print("Input your favourite food:");//Print line
		
		favFood = inp.nextLine();//Run the scanner, ask for input
		
		if (favFood.equals("Pizza")||favFood.equals("pizza")){//If the input = "Pizza" or "pizza"
			System.out.println("Mine's pizza too!");//print this
		
	}else{
		System.out.println("I hate that. Personally, I like pizza.");
	}	inp.close();//Close scanner
}

}
