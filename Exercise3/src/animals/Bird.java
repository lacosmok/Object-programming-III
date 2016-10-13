package animals;

public class Bird extends Animal {
	@Override
	public void sleep(){
		System.out.println("A bird sleeps...");
	}
	@Override
	public void eat(){
		System.out.println("A bird eats...");		
	}
}
