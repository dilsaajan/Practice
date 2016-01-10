package com.dilsaajan.practice;

import java.util.Scanner;//Import scanner

public class Switch {
	public static void main(String args[]){
		int num;//Integer variable
		
		Scanner inp = new Scanner(System.in);//Scanner variable inp
		
		System.out.print("Input a number between 1 - 5: ");//Print this
		
		if (inp.hasNextInt()){//If the input is a number
			num = inp.nextInt();//Ask for input
			switch (num){//Go through the variable num
			case 1://In the case of the variable num being equal to '1', do this:
				System.out.println("You picked the number: "+1);
				break;//break the switch
			case 2:
				System.out.println("You picked the number: "+2);
				break;
			case 3:
				System.out.println("You picked the number: "+3);
				break;
			case 4:
				System.out.println("You picked the number: "+4);
				break;
			case 5:
				System.out.println("You picked the number: "+5);
				break;
			default:
				System.out.println("Not a number between 1 - 5. IDIOT");
			}
		}else{
		System.out.print("Not a valid input.");//if the variable isnt an integer
		}
		inp.close();//close the scanner
	}
}
