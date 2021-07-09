package p3;

public class Animal {

	int legs;
	int eyes;
	int weight;
	String color;
	public Animal() {
	
	}
	public Animal(int legs, int eyes, int weight, String color) {
		
		this.legs = legs;
		this.eyes = eyes;
		this.weight = weight;
		this.color = color;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void doEatFood()
	{
		weight+=(weight/20);
		System.out.println("Animal doEat Food called "+weight);
	}
	
}
