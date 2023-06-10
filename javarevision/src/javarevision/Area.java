package javarevision;

public class Area
{

public static void main(String[] args) 
{
Area circle=new Area();
Area rectangle=new Area();
Area square=new Area(); 
circle.area(5.5d);
rectangle.area(5,3);
square.area(7);

}
public void area(double r)
{
	 
double area=(22*r*r)/7;
System.out.println("Area of circle is "+area);
}
public void area(double l,double b)
{
double area=l*b;
System.out.println("Area of rectangle is "+area);
}
public void area(int s)
{
int area=s*s;
System.out.println("Area of square is "+area);
}
	}


