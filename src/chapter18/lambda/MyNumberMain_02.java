package chapter18.lambda;

public class MyNumberMain_02 {

	public static void main(String[] args) {

		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
		
		
	}	

}
