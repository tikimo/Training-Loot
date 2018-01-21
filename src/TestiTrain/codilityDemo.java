package TestiTrain;

public class codilityDemo {
	public static void main(String[] args) {
		int[] a = {-1,3,-4,5,1,-6,2,1};
		System.out.println(solution(a));
	}

	public static int solution(int[] A) {
		
		for (int i = 0; i < A.length; i++) {
			if (sumBeforeP(i, A) == sumAfterP(i, A)){
				return i;
			}
		}
		return -1;
		
	}

	public static int sumBeforeP(int p, int[] list) {
		int sum = 0;
		for (int i = 0; i < p; i++) {
			sum += list[i];
		}
		
		return sum;
	}

	private static int sumAfterP(int p, int[] list) {
		int sum = 0;
		for (int i = list.length-1; i > p; i--) {
			sum += list[i];
		}
		return sum;
	}

}
