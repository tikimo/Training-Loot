package TestiTrain;

public class problem2 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		
		while (n2 < 4000000) {
			if (n2%2 == 0) {
				sum += n2;
			}
			int temp = n2; 
			n2 = nextFibo(n1, n2);
			n1 = temp;
		}
		System.out.println(sum);

	}
	
	/**
	 * This method reduces load
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static int nextFibo(int n1, int n2) { // n1 = n-1; n2 = current
		return n1 + n2;
	}


}
