package javarevision;
public class Add {
	int a,b;
	
	public  Add(int a,int b)
	{
	this.a=a;
	this.b=b;
	
	}
	
	void display() 
	{
		
	
		int sum=a+b;

		System.out.println(sum);
	}
	
	public static void main(String args[])
	{
		Add a=new Add(10,6);
		a.display();
	}

}
