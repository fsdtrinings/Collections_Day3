package day2.mo;

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
		byte b = 10;
		callMe(b);
	}
/*
	static void callMe(byte b)
	{
		System.out.println("byte");
	}

	static void callMe(long b)
	{
		System.out.println("long");
	}

	static void callMe(int b)
	{
		System.out.println("int");
	}

	*/
	static void callMe(Long b)
	{
		System.out.println("Long");
	}
	
	static void callMe(byte... b)
	{
		System.out.println("byte var arg...");
	}
	
	

	
}
