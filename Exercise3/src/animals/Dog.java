package animals;

public class Dog extends Animal {
	@Override
	public void sleep(){
		System.out.println("A dog sleeps...");
	}
	@Override
	public void eat(){
		System.out.println("A dogf eats...");		
	}
}
