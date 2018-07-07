package introduction;

public class Cow extends Animal {

	@Override
	public void speak() {
		System.out.println("Moooo");

	}

	@Override
	public void move() {
		System.out.println("cow can move");

	}

	public void doCowThing() {
		System.out.println("do generic animal stuff");
	}

}
