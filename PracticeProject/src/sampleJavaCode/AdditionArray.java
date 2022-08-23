package sampleJavaCode;

public class AdditionArray {

	public static void main(String[] args) {
		int inputNum[]=new int[] {2,-2,3,0,4,-7};
		AdditionArray objCT= new AdditionArray();
		System.out.println(objCT.solution(inputNum));
		System.out.println(inputNum);
	}
	int solution(int[] A){
        int u=0;
        int N = A.length;
        if (N <= 100000) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
        	int k=0;
        	k=k+A[l];
        	if (A[l] == 0) {
                return -l;
            } else {
                u=4;
            }
        }
        return u;
    }

}
