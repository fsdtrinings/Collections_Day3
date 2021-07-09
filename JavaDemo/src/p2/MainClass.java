package p2;

public class MainClass {

	public static void main(String[] args) {
		
		
		Engine e = new Engine(1800);
		Engine e2 = new Engine(1200);
		
		Wheel wheels[] = new Wheel[4];
		MusicSystem poineer = new MusicSystem("Poineer");
		MusicSystem sony = new MusicSystem("Sony");
				
		
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel("GoodYear",10);
		}
		
		// ------------------------------------------
		
		Car honda = new Car(e, "Black", "Honda",wheels);
		
		//-----------------------------------
		
		
		
		honda.setMusicSystem(poineer);
		System.out.println(honda.getE().getPower());
		
		honda.setE(e2);
		honda.setMusicSystem(sony);
		
		System.out.println(honda.getE().getPower());
		
		
		
		
		
		
		
	}
}







