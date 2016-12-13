package ex07_Interface;

public class Dog extends Animal implements MakeSoundable{

	@Override
	public void makeSound() {
		System.out.println("Dog");
		
	}
	
}
