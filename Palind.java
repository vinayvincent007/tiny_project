package pallindrr;

import java.util.Scanner;

public class Palind {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scanner.nextInt();

		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number ");
		} else {
			System.out.println("not palindrome");
		}

	}
}
