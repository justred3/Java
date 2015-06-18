package day36_Pattern_工厂模式;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
