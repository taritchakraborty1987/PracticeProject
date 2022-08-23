package sampleJavaCode;

public class FiboPrime {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		
		System.out.print("FIBO Prime Number: "+i+" "+j);
		
		// 1st method
		for(int k=0;k<100;) {
		k=i+j;
		if(k<100) {
		int m=0;
			for(int n=2;n<k;n++) {
				if(k%n==0) {
				m=1;
				}
			}
			if(m==0) {
				System.out.print(" "+k);
			}
			i=j;
			j=k;
		}
		}
		
		// 2nd method
		/*for(int k=0;k<100; k++) {
			int l=i+j;
			if(l<100) {
					int m=0;
						for(int n=2;n<l;n++) {
							if(l%n==0) {
							m=1;
							}
						}
						if(m==0) {
							System.out.print(" "+l);
						}
						i=j;
						j=l;
					} else {
						break;
				}
		}*/
		
	}

}
