package sampleJavaCode;

public class FindError {

	public static void main(String[] args) {
		int inputNum[]=new int[] {1, 2, 5, 9, 9};
		int intPosition = 5;
		FindError objCT= new FindError();
		System.out.println(objCT.solution(inputNum,intPosition));
		System.out.println(inputNum);
	}
	int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[l] == X) {
                return l;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {

        }
        return -1;
    }
	
	//Given Function:
	/*int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }*/

}
