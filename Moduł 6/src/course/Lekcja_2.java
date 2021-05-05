package course;

public class Lekcja_2 {

	public static void main(String[] args) {
		boolean holidays = true;
		int shampoo = 800; //ml
		int soap = 2; //kostka myd³a
		int detergent = 1; //kg
		int shampooExpected = 1200;
		int soapExpected = 4;
		int detergentExpected = 3;
		
		if (shampoo < shampooExpected / 2 && holidays) {
			int shampooNeeded = (shampooExpected / 2) - shampoo;
			System.out.println("Obecnie szamponu jest: " + shampoo + " ml. Potrzebnych jest dodatkowych " + shampooNeeded + " ml.");
		}
		else if (shampoo < shampooExpected) {
			int shampooNeeded = shampooExpected - shampoo;
			System.out.println("Obecnie szamponu jest: " + shampoo + " ml. Potrzebnych jest dodatkowych " + shampooNeeded + " ml.");
		}
		if (soap < soapExpected / 2 && holidays) {
			int soapNeeded = (soapExpected / 2) - soap;
			System.out.println("Obecnie myd³a jest: " + soap + " kostki. Potrzebnych jest dodatkowych " + soapNeeded + " kostek.");
		}
		else if (soap < soapExpected) {
			int soapNeeded = soapExpected - soap;
			System.out.println("Obecnie myd³a jest: " + soap + " kostki. Potrzebnych jest dodatkowych " + soapNeeded + " kostek.");
		}
		if (detergent < detergentExpected) {
			int detergentNeeded = detergentExpected - detergent;
			System.out.println("Obecnie proszku do prania jest: " + detergent + " kg. Potrzebnych jest dodatkowych " + detergentNeeded + " kg.");
		}
		
	}

}
