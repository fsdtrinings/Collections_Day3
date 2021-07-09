package p3;

public class BullDog extends Dog {

	int dressWeight = 10;
	int bullDogTotalWeight;
	
	public BullDog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BullDog(int legs, int eyes, int weight, String color) {
		super(legs, eyes, weight, color);
		
		this.bullDogTotalWeight = super.weight + this.dressWeight;
	}

	public void doSecurity()
	{
		System.out.println(" Class BullDog doSecurity called ");
	}
}
