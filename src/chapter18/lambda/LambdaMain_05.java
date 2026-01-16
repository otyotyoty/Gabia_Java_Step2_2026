package chapter18.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaMain_05 {

	public static void main(String[] args) {

		// 두 개의 인자를 받아서 합 리턴
		BiFunction<Integer, Integer, Integer> f1 = (x,y) -> x+y;
		System.out.println("15와 24의 합 : " + f1.apply(15, 24));
		
		BiFunction<String, String, String> f2 = (s1,s2) -> s1.concat(s2);
		System.out.println(f2.apply("람다", "식"));

		BiConsumer<Integer, Integer> f3 = (x,y) -> System.out.println(x>y?x:y);
		System.out.println("10과 9중 큰 수 출력: ");
		f3.accept(10,9);
		
		BiPredicate<String, Integer> f4 = (x,y) -> x.length() == y;
		System.out.println("apple은 5자이다: " + f4.test("apple", 5));
		System.out.println("pineapple은 5자이다: " + f4.test("pineapple", 5));
	}

}
