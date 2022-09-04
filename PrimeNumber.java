package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 233, count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(number + " is Prime Number");
		} else {
			System.out.println(number + " is not Prime");
		}
	}

}
