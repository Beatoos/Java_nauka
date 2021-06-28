package course;

import java.util.Scanner;

public class Lekcja_1 {
	
	public static void showMin( int [] pkb) {
	    int min = pkb[0];
	    for (int i = 1; i < pkb.length; i++) {
	      if (pkb[i] < min)
	        min = pkb[i];
	    }
	    System.out.println("Lowest value: " + min);
	  }
	
	public static void showMax( int [] pkb) {
		int max = 0;
		for (int i = 0; i < pkb.length; i++) {
			if (pkb[i] > max) {
				max = pkb[i];
			}
		}
		System.out.println("Highest value: " + max);
	}
	
	public static void showAll(int [] pkb) {
		for (int i = 0; i < pkb.length; i++) {
			System.out.println("200" + i + ": " + pkb[i]);
		}
	}
	public static void showOne(int [] pkb) {
		Scanner read = null;
		try {
			read = new Scanner(System.in);
			System.out.print("Select new year: 200");
			int year = read.nextInt();
			if (year <= 9) {
				System.out.println("200" + year + ": " + pkb[year]);
			}
			else {
				System.out.println("Wrong value");
			}
		}
		finally {
			if (read != null) read.close();
		}
	}

	public static void main(String[] args) {
		int pkb [] = {747032, 779975, 810617, 
		        845930, 933062, 990463, 
		        1069815, 1187599, 1286063, 
		        1372201};
		showAll(pkb);
		showOne(pkb);
		showMax(pkb);
		showMin(pkb);

	}

}
