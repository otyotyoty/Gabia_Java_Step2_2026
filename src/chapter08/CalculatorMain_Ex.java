package chapter08;

import java.util.Scanner;

public class CalculatorMain_Ex {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 A를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("정수 B를 입력하세요: ");
		int b = scan.nextInt();
		
		// 방법1
		Example[] calculators = { new CalPlus(), new CalMinus() };

		for (Example ca : calculators) {
			System.out.println(ca.getClass().getSimpleName() + ": " + ca.getResult(a, b));
		}
		System.out.println();

		// 방법2
		int plus = calc(new CalPlus(), a, b);
		int minus = calc(new CalMinus(), a, b);
		
		System.out.println(calculators[0].getClass().getSimpleName() + ": " + plus);
		System.out.println(calculators[1].getClass().getSimpleName() + ": " + minus);
		
	}
	
	public static int calc(Example ex, int a, int b) {
		return ex.getResult(a, b);
	}

}
