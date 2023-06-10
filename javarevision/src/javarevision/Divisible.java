package javarevision;



public class Divisible extends Addition {
	
	public void divi()
	{
		int result=super.addition(5, 6);
		System.out.println(result);
		
		if(result%10==0)
		{
			System.out.println("Result is Divisible by 10");
		}
		else
		{
			System.out.println("Result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		
	
	

		Divisible n=new Divisible();
		n.divi();
		
		
		
		
	}

}
