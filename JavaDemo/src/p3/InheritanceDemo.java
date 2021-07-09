package p3;

// client code 
// replace HTML code / Angular / Android (kotlin) / ios(swift)
public class InheritanceDemo {

	
	public static void main(String[] args) {
		
		
		BullDog a = new BullDog(4,2,50,"brown");
		a.doEatFood();
		System.out.println(a.getWeight());
		a.playGames();
		System.out.println(a.getWeight());
		a.doSecurity();
		
		
		
		Dog d = new Dog();
		d.playGames();
		d.doEatFood();
		// d.doSecurity();  // error
	}
}
