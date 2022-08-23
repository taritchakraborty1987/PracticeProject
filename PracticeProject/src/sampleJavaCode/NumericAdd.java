package sampleJavaCode;

class NumericAdd{
	public static void main (String args[]){
		int a=6;
		int b=7;
		NumericAdd objClass = new NumericAdd();
		objClass.add(a,b);
	}
	
	//Method for numeric addition
	void add(int i,int j){
		System.out.println("First Number is : "+i);
		System.out.println("Second Number is : "+j);
		int k = i+j;
		System.out.println("Addition of those two number is : "+k);
	}
}
