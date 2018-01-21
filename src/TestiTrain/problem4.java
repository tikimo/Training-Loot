package TestiTrain;

public class problem4 {
	/*
	 * Largest Palindrome product
	 */

	public static void main(String[] args) {
		int largestPalindrome = 0;
		int n1 = 0, n2 = 0;
		
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				if (isPalindrome(i,j)) {
					if (i*j > largestPalindrome) {
						largestPalindrome = i*j;
						n1 = i;
						n2 = j;
					}
				}
			}
		}
		System.out.println(largestPalindrome + "\nMade from: " + n1 + " AND " + n2);
	}
	
	private static boolean isPalindrome(int a, int l) {
		String product = a*l +"";
		
		int alku = 0, loppu = product.length()-1;
		
		while (alku < loppu) {
			if (product.charAt(alku) != product.charAt(loppu)) {
				return false;
			}
			alku++; 
			loppu--;
		}
		return true;
	}

}
