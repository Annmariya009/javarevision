package javarevision;
public class Bike extends Vehicle {
	@Override
	void display()
	
	{
		System.out.println("bike is running");
	}
public static void main(String args[])
{
	Vehicle s=new Bike();
	s.display();
}
}