package sampleJavaCode;

public class PrintGraterNumber {

	public static void main(String[] args) {
		int numberOne = 69;
		int numberTwo = 89;
		int numberThree = 108;
		
		if (numberOne>numberTwo && numberOne>numberThree) {
			System.out.println("The Grater Number is : "+numberOne);
		}else if (numberTwo>numberThree) {
			System.out.println("The Grater Number is : "+numberTwo);
		}else {
			System.out.println("The Grater Number is : "+numberThree);
		}
	}
}
