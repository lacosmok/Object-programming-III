package animals;

public class Animal {
	public void sleep(){
		System.out.println("An animal sleeps...");
		
	}
	public void eat(){
		System.out.println("An animal eats...");		
	}

	public static void sleepAnimal(Animal animal) { animal.sleep();}
}