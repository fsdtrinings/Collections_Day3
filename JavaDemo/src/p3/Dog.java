package p3;

public class Dog extends Animal{
	
	
	
	public Dog() {
		super();
		
	}

	public Dog(int legs, int eyes, int weight, String color) {
		super(legs, eyes, weight, color);
		
	}

	public void playGames()
	{
		weight-=1;
		System.out.println("Dog play Games called , After playing Games Weight :- "+weight);
	}

}
