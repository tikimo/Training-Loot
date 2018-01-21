package TestiTrain;
import java.util.*;

public class solultion {
	public static void main(String[] args) {
		int[] a = {1,3,2,1};
		int[] b = {0,0,0,0,4,2,5,3,2};
		System.out.println(solution(a,b));
	}
	
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
}
