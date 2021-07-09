package p2;

public class Car {
	
	private Engine e;
	private String color;
	private String brandName;
	private Wheel wheels[];
	
	private MusicSystem musicSystem;
	
	//  ... other information 

	public Car() {
		
	}

	public Car(Engine e, String color, String brandName, Wheel[] wheels) {
		this.e = e;
		this.color = color;
		this.brandName = brandName;
		this.wheels = wheels;
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
