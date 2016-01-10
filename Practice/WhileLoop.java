package com.dilsaajan.practice;

public class WhileLoop {
	public static void main(String args[]){
		
		int x = 5;//Integer variable containing '5'
		
		while (x > 0){//If the variable is more than 0
			System.out.println(x);//print the value inside the variable
			x--; //Accidently done x++ at first LOL (It went infinite) Anyway, subtract 1 from x
		}
		System.out.println("***END OF CODE***");//End of code
	}
}
