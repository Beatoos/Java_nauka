package course;

import java.util.Scanner;

public class Lekcja_2 {
	
	public static void showAverage(int [] pkb) {
		int average = pkb.length;
		int sum = 0;
		for (int i = 0; i < pkb.length; i++) {
			sum = sum + pkb[i];
		}
		System.out.println(sum / average);
	}
	
	public static void showMax (int [] pkb) {
		int max = 0;
		String year = "200";
		int yearr = 0;
		for (int i = 0; i < pkb.length; i++) {
			if (pkb[i] > max) {
				max = pkb[i];
				yearr = i;
			}
		}
		System.out.println(year + yearr);
	}
	
	public static void showMin( int [] pkb) {
	    int min = pkb[0];
	    String year = "200";
	    int yearr = 0;
	    for (int i = 1; i < pkb.length; i++) {
	      if (pkb[i] < min) {
	        min = pkb[i];
	      	yearr = i;
	      }
	    }
	    System.out.println(year + yearr);
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
		finally{
			if (read != null) read.close();
		}
	}

	public static void showAll(int [] pkb) {
		for (int i = 9; i >= 0; i--) {
			System.out.println("200" + i + ": " + pkb[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int [] pkb = {19527, 20391, 21203, 22148, 24438, 25955, 28056, 31158, 33741, 35966};
		
		showAll(pkb);
		showOne(pkb);
		showMin(pkb);
		showMax(pkb);
		showAverage(pkb);
		
	}

}
