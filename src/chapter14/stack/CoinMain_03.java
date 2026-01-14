package chapter14.stack;

import java.util.Stack;

public class CoinMain_03 {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(2));
		coinBox.push(new Coin(5));
		coinBox.push(new Coin(1));
		coinBox.push(new Coin(3));
		coinBox.push(new Coin(4));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 돈: " + coin.getValue());
		}
	}

}
