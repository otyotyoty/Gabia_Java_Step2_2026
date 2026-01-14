package chapter08;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("기본 공격력 입력: ");
		int ba = sc.nextInt();
		
		System.out.println("전사 스킬: " + useSkill(new Warrior(), ba));
		System.out.println("마법사 스킬: " + useSkill(new Mage(), ba));
		
	}

	public static int useSkill(Character c, int num) {
		return c.attack(num);
	}

}
