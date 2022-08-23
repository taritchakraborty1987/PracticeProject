package sampleJavaCode;

public class MaxOneDigit {

	public static void main(String[] args) {
		int inputNum[]=new int[] {-6, 1, 1011, -100, 6, -22, 0, 1, 7};
		MaxOneDigit objCT= new MaxOneDigit();
		System.out.println(objCT.solution(inputNum));
	}
	public int solution(int[] A) {
		int k=0;
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]>A[j]){
					k=A[i];
					A[i]=A[j];
					A[j]=k;
				}
			}
		}
		k=0;
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[j]>0 && A[j]<10){
					if(k<A[j]) {
						k=A[j];
					}
				}
			}
		}
		return k;
	}
	
	/*public int solution(int[] A) {
		int k=0;
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]>0 && A[i]<10) {
					if(k<A[i]) {
						k=A[i];
						A[i]=A[j];
						A[j]=k;
					}
				}
			}
		}
		return k;
	}*/
}
