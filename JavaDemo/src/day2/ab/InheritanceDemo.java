package day2.ab;


interface Web
{
	public String serverInteracton(int portNumber);
}

interface HttpProtocol extends Web
{
	
}

interface Location
{
	public int currentLocation();
	
}


abstract class Application
{
	public abstract int memoryRequirement();
	public abstract int executionPolicy();
	
	
	public void platform()
	{
		System.out.println(" Android or IOS");
	}
}


class Uber extends Application implements HttpProtocol,Location
{

	
	
	@Override
	public int currentLocation() {
		
		return 10101;
	}



	@Override
	public String serverInteracton(int portNumber) {
		
		return "List of cabs";
	}



	@Override
	public int memoryRequirement() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	
	
	@Override
	public int executionPolicy() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void platform()
	{
		System.out.println(" Android / IOS / sibase");
	}
	
}


class Amazon extends Application implements Web
{
	
	
	@Override
	public String serverInteracton(int portNumber) {
		
		return "list of products";
	}
	@Override
	public int executionPolicy() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int memoryRequirement() {
		
		return 275;
	}
	
}

class Calculator extends Application
{

	@Override
	public int memoryRequirement() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int executionPolicy() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		// Application app = new Application();
		Application app = new Uber();
		app = new Amazon();
				
	}
}

















