package course;

public class Lekcja_1 {

	public static void main(String[] args) {
		boolean party = true;
		int cheese = 100; //grams
		int	milk = 0; //liters
		int eggs = 2;
		int cheeseExpected = 400; //grams
		int milkExpected = 5; //liters 
		int eggsExpected = 20;
		
		if (cheese < cheeseExpected) {
			int cheeseNeeded = cheeseExpected - cheese;
			System.out.println("Zapotrzebowanie na ser wynosi:");
			System.out.print(cheeseNeeded);
			System.out.println(" gram");
			System.out.println("");	
		}
		if (milk < milkExpected * 3 && party) {
			int milkNeeded = (milkExpected * 3) - milk;
			System.out.println("Zapotzrebowanie na mleko wynosi:" + milkNeeded + "litrów");
			System.out.println("");
		}
		else if (milk < milkExpected) {
			int milkNeeded = milkExpected - milk;
			System.out.println("Zapotzrebowanie na mleko wynosi: " + milkNeeded + " litrów");
			System.out.println("");
		}
		if (eggs < eggsExpected * 2 && party) {
			int eggsNeeded = (eggsExpected * 2) - eggs;
			System.out.println("Zapotrzebowanie na jajka wynosi: " + eggsNeeded + " sztuk");
			System.out.println("");
		}
		else if (eggs < eggsExpected) {
			int eggsNeeded = eggsExpected - eggs;
			System.out.println("Zapotrzebowanie na jajka wynosi: " + eggsNeeded + " sztuk");
			System.out.println("");
		}
	}

}
