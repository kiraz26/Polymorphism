package introduction;

public class CheckingTypeCompatibility {

	public static void main(String[] args) {
		
		Animal a = new Cat();
		
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Movable);
		
		//Movable m1 = a;
		Movable m1 = new Dog();
		m1.move();
		
		
		
		
	}

}
