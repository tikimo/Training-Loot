package TestiTrain;
import java.util.ArrayList;
/**
 * 
 * @author Tijam Moradi
 *
 * projecteuler.net/archives
 * 
 */

public class problem1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int below = 1000;
		
		for (int i = 0; i<below; i++) {
			if (i%3==0 || i%5==0) {
				nums.add(i);
			}
		}
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		System.out.println(sum);
	}
}
