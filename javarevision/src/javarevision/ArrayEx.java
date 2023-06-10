package javarevision;

import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();

		s.add("ann");
		s.add("maria");
		boolean b = false;
		for (int i = 0; i<s.size(); i++) {
			if (s.get(i).contains("maria")) {
				System.out.println(b);
			

			}
		}
	}

}
