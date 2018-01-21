package TestiTrain;
import java.util.ArrayList;


public class problem3 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		long n = 600_851_475_143L;
		
		for (int i = 2; i <= n; i++) {
			while (n%i == 0) {
				primes.add(i);
				n /= i;
			}
		}
		System.out.println(primes);

	}

}
