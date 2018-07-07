package introduction;

public class Dog extends Animal {

	@Override
	public void speak() {
		
		System.out.println("Havhav");

	}

	@Override
	public void move() {
		System.out.println("dog can move");

	}

	public void doDogThing() {
		System.out.println("do generic animal stuff");
	}

}
