package chapter09;

public class GameMain_06 {

	public static void method(GameCharacter c) {
		c.fight();
	}
	public static void main(String[] args) {
		
		System.out.println("===전사 전투===");
		method(new Warrior());
		System.out.println();
		System.out.println("===마법사 전투===");
		method(new Wizard());
		
		System.out.println("\n\n====전사 전투====");
		GameCharacter warrir = new Warrior();
		warrir.fight();
		System.out.println("\n====마법사 전투====");
		GameCharacter wizard = new Wizard();
		wizard.fight();
		
	}
}
