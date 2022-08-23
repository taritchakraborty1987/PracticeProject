package sampleJavaCode;

public class NumberSwap {

	public static void main(String[] args) {
		//Swap int using third variable
		int i=6;
		int j=7;
		System.out.println("Before Sawping: "+i+" "+j);
		int h;
		h=i;
		i=j;
		j=h;
		System.out.println("After Sawping: "+i+" "+j);
		
		//Swap int not using third variable
		int k=6;
		int l=7;
		System.out.println("Before Sawping: "+k+" "+l);
		k=k+l;
		l=k-l;
		k=k-l;
		System.out.println("After Sawping: "+k+" "+l);
		
		//Swap String using third variable
		String m="Tarit";
		String n="Tanvi";
		System.out.println("Before Sawping: "+m+" "+n);
		String o;
		o=m;
		m=n;
		n=o;
		System.out.println("After Sawping: "+m+" "+n);
	}

}
