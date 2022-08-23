package sampleJavaCode;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		int inputFrmInputMethod=inputNumber();
		oddEvenFun(inputFrmInputMethod);
	}
	
	public static int inputNumber() {
		//To take input from user
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int inputNumber = inputObj.nextInt();
		return inputNumber;
	}
	
	public static void oddEvenFun(int i) {
		if(i%2==0) {
			System.out.println("Input value is 'Even' number. Thanks!");
		}
		else {
			System.out.println("Input value is 'Odd' number. Thanks!");
		}
	}
}
