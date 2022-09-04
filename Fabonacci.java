package week1.day1;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber = 0, secondNumber = 1, sum = 0;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i = 3; i <= 11; i++) {

			sum = firstNumber + secondNumber;
			System.out.println(sum);

			firstNumber = secondNumber;
			secondNumber = sum;

		}

	}

}
