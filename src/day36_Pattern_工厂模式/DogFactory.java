package day36_Pattern_工厂模式;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		
		return new Dog();
	}

}
