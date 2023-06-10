package javarevision;

public class LicenseExcep {
	
		 static int age=15;
		public static void Show() throws LicenseException
		{
			if(age<18)
			{
				throw new LicenseException("not eligible") ;
			}
			else
			{
			System.out.println("eligible");
			}
		}

		public static void main(String[] args) {
			try {
				Show();
			} catch (LicenseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


