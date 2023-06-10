package javarevision;

public class ThrowEx {
	 static int age=15;
	public static void Show()
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
		System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		Show();

	}

}
