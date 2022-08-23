package sampleJavaCode;

public class CodibiltyTest {

	public static void main(String[] args) {
		/*This is a demo task.
		Write a function: class Solution { public int solution(int[] A); } 
		that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
		For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
		Given A = [1, 2, 3], the function should return 4.
		Given A = [−1, −3], the function should return 1.
		Write an efficient algorithm for the following assumptions:
		N is an integer within the range [1..100,000];
		each element of array A is an integer within the range [−1,000,000..1,000,000].*/
		int inputNum[]=new int[] {1, 2, 3};
		CodibiltyTest objCT= new CodibiltyTest();
		System.out.println(objCT.solution(inputNum));
	}
	public int solution(int[] A) {
		int k=0;
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]>A[j]) {
					k=A[i];
					A[i]=A[j];
					A[j]=k;
				}
			}
		}
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[j]<0||A[i]<0) {
					k=1;
				}else {
						int x=A[j]-A[i];
						if(x<0){
							k=1;
						}if(x==1){
							k=A[j]+1;
						}if(x==2){
							k=A[j]-1;
						}
				}
			}
		}
		return k;
	}
}
