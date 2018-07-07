package introduction;

public class AnimalAccess {

	public static void main(String[] args) {
		
		// -->larger or general means Super Type, smaller and concrete means Sub Type here
		// *Upcasting mean storing an object with concrete type into larger reference
		// type inheritance-wise
		// *Downcasting mean storing an object with larger type into smaller reference
		// type inheritance-wise
		
		//Animal a =new Person(); can not assign unrelated types, will not compile
		
		//Only the referenceType of variable will decide what can this variable access
		//Only the object type decide what method will be called at run time if it's overridden 
		
		
		Animal a1 = new Dog(); // upcasting happen implicitly
		a1.speak();
		// Only reference type decide what a variable can access
		// a1.doDogThing(); --> X it needs casting
		a1.animalThing();

		// CASTING
		int i1 = 10;
		long l = i1; // Upcasting -->happen implicitly
		int i2 = (int) l; // Downcasting -->user have to cast it or it will not compile

		Dog d1 = (Dog) a1; // downCASTING
		d1.doDogThing();

		// we can upcasting it back to animal
		Animal a3 = d1;

		// Cat c1 = (Cat)a1;
		// c1.doCatThing(); -->cast exception non-related another object
		
		
		Object o1 = new Person(); // we can not access to cow class's methods
		//o1.speak();
		boolean isCow = o1 instanceof Cow; //check
		if(isCow) {
			Cow c = (Cow) o1;
			c.doCowThing();
		}
		
		System.out.println( a1 instanceof Dog );
		
		

	}

}
