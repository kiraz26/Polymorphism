package introduction;

public class Cat extends Animal {

	@Override
	public void speak() {
		System.out.println("Miyavv");

	}

	@Override
	public void move() {
		System.out.println("cat can move");

	}

	public void doCatThing() {
		System.out.println("do generic animal stuff");
	}

}
