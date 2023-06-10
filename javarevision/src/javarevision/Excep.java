package javarevision;
public class Excep {
	
int a=5;

public void Division()
{

try

{
int b=a/0;
System.out.println(b);

}
catch(Exception e)
{
	System.out.println(e);	
}
finally {
	System.out.println("hi");
}
}


public static void main(String args[])
{
	
	
	Excep s=new Excep();
	s.Division();
	
	
	
	
	
		
	
	
}
}
