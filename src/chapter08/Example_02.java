package chapter08;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("기본 공격력 입력: ");
		int ba = sc.nextInt();
		
		Character[] character = {new Warrior(), new Mage()};
		for(Character c: character) {
			System.out.println(c.getClass().getSimpleName() + " 캐릭터 공격력: " + c.attack(ba));
		}

	}

}
