package day36_Pattern_����ģʽ;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		
		return new Dog();
	}

}
