public class Klausurnoten {
	
	public static void main(String[] args) {
		
		Out.println("Klausurnoten");
		Out.println("============");
		
		Out.print("Wie viele Punkte haben Sie erreicht: ");
		int points = In.readInt();
		
		// Punkte auf Note umrechnen
		// NGT5 < 12 Punkte: Nicht Genügend
		int grade = 5;
		
		if ((12 <= points) && (points <= 14))	grade = 4;   // GEN4 12-14 Punkte: Genügend
		if ((15 <= points) && (points <= 17))	grade = 3;   // BEF3	15-17 Punkte: Befriedigend
		if ((18 <= points) && (points <= 21))	grade = 2;   // GUT2 18-21: Gut
		if ((22 <= points) && (points <= 24))	grade = 1;   // SGT1	22-24: Sehr gut

		// Note als Text ausgeben
		Out.print("Sie haben ein ");
		switch (grade) {
			case 4: Out.println("Genuegend"); break;
			case 3: Out.println("Befriedigend"); break;
			case 2: Out.println("Gut"); break;
			case 1: Out.println("Sehr Gut"); break;
			case 5:														// drop through
			default:
				Out.println("Nicht Genuegend");
		} // end case
		
	} // end main()
} // end class