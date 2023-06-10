package javarevision;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	

	public static void main(String[] args) 
	{
		ArrayList <String> colors=new ArrayList();
		colors.add("green");
		colors.add("blue");
		colors.add("red");
		System.out.println(colors);
		System.out.println(colors.get(0));
		colors.remove(1);
		System.out.println(colors);
		Iterator itr=colors.iterator();//getting the Iterator  
		  while(itr.hasNext())
		  {
			 System.out.println(itr.next());  
		  }
	}

} 
