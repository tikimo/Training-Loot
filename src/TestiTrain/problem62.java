package TestiTrain;

public class problem62 {

	public static void main(String[] args) {
		int count = 0;
		int smallestCube = 41063625;
		
		while (count < 5) {
			smallestCube += 1;
			System.out.println(smallestCube);
			for (int i = 0; i < (smallestCube + "").length()-1; i++) {
				if (Math.pow(smallestCube, 1/3)%1 == 0) {
					count++;
					System.out.println("count: "+ count);
				}
				smallestCube = reArrange(smallestCube);
				System.out.println(smallestCube+" RE");
				count = 0;
			}
		}
		
		System.out.println(smallestCube);
	}
	
	private static int reArrange(int num) {
		String number = (num+"").substring(1)+(num+"").substring(0, 1);
		while (number.charAt(0)=='0') {
			number = number.substring(1) + number.substring(0, 1);
		}
		return Integer.parseInt(number);
	}
}
