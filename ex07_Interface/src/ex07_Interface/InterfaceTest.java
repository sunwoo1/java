package ex07_Interface;

public class InterfaceTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		MakeSoundable m = d;
		m.makeSound();
	}

}
