package ex07_Interface;

public class Cat extends Animal implements MakeSoundable{

	@Override
	public void makeSound() {
		System.out.println("Cat");
		
	}

}
