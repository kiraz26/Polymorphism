package introduction;

import java.util.ArrayList;
import java.util.List;

public class AnimalShow {

	public static void main(String[] args) {

		Animal dog2 = new Dog();
		Animal cat2 = new Cat();
		Animal cow2 = new Cow();

		dog2.speak();
		cat2.speak();
		cow2.speak();

		System.out.println("========================");

		// Animal a4 = new Animal();
		// a4.speak();

		System.out.println("========================");

		// ArrayList<Animal> lst = new ArrayList<>();
		List<Animal> lst = new ArrayList<>();
		// Animal animal1 = new Animal();
		Animal animal2 = new Dog();
		Animal animal3 = new Cat();
		Animal animal4 = new Cow();

		// lst.add(new Animal());
		// lst.add(new Dog());
		// lst.add(new Cat());
		// lst.add(new Cow());

		// lst.add(animal1);
		lst.add(animal2);
		lst.add(animal3);
		lst.add(animal4);

		for (Animal animal : lst) {
			animal.speak();
		}

		System.out.println("==========================");

		Movable dog1 = new Dog();
		Movable cat1 = new Cat();
		Movable cow1 = new Cow();
		
		List<Movable> movable = new ArrayList<>();
		movable.add(dog1);
		movable.add(cat1);
		movable.add(cow1);
		//OR List<Movable> movable = Arrays.asList(dog1,cat1,cow1); --->unmodifiable list  
		for (Movable movable2 : movable) {
			movable2.move();
		}

		// dog1.move();
		// cat1.move();
		// cow1.move();
		System.out.println("========================");
		
		Movable m1 = new Person();
		m1.move();
		
		
	}

}
