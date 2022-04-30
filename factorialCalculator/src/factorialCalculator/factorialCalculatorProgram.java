package factorialCalculator;

import java.util.Scanner;

public class factorialCalculatorProgram {

	public static void main(String[] args) {

		int base = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		int a = sc.nextInt();
		if(a <= 0) {
			System.out.println("Please input a positive number.");
		}
		else {
			System.out.println("The factorial of your integer is");
			for(int i = a; i >= 2; i--) {
				base = base * i;
				System.out.println(i + "*");
			}
			System.out.println("Factorial of number "+ a + " is "+ base);
		}

		
	}

}
