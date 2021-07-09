package p3;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Demo2 obj = new Demo2();
		
		Animal a = new Dog();
		Animal dog = new Dog(4,2,50,"Brown");
		Animal bullDog = new BullDog(4,2,30,"Brown");
		Animal cat = new Cat(4,2,20,"Black");
		
		obj.doAnimalThings(dog);
		obj.doAnimalThings(bullDog);
		obj.doAnimalThings(cat);
		
	}
	
	public void doAnimalThings(Animal a)
	{
		a.doEatFood();
		//Dog d = new Dog();   // problem becoz state issue 
		
		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.playGames();
		}
		if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			// call cat functions/method
		}
		
		 
	}

}
