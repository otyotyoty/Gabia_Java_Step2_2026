package chapter09;

public class AnimalMain_02 {

	public static void main(String[] args) {
		
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal a) {
		a.sound();
	}
}
