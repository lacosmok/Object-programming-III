package animals;

public class AnimalsInheritance {
	public static void main( String [ ] args ) {
		Bird bird1 = new Bird();
		bird1.eat();
		Dog dog1 = new Dog();
		Eagle eagle1 = new Eagle();
		eagle1.eat();
		Animal.sleepAnimal(eagle1);
	}
}
