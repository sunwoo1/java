package ex04_Polymorphism;

public class PolyTest {
	
	public static void makeSoundTest(Animal a){
		a.makeSound();
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		makeSoundTest(cat);
		makeSoundTest(dog);
	}

}
