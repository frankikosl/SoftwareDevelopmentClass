public class malearbeiten{
	
	public static void main(String [] args) {
        
        Out.println("Bitte laenge eingeben: ");
        int laenge = In.readInt();
        Out.println("Bitte breite eingeben: ");
        int breite = In.readInt();
        Out.println("Bitte hoehe eingeben: ");
        int hoehe = In.readInt();
        int kosten;
        
        if (hoehe > 3){
            int wandflaeche = (2 * laenge * hoehe) + (2 * breite * hoehe);
            int deckeflaeche = (laenge * breite);
            kosten = wandflaeche * 5 + deckeflaeche * 7 ;
        }
        else{
            int wandflaeche = (2 * laenge * hoehe) + (2 * breite * hoehe);
            int deckeflaeche = (laenge * breite);
            kosten = wandflaeche * 5 + deckeflaeche * 5 ;
        }
        Out.println("Die Kosten betragen: " + kosten + " EUR");
        
 
    
			
	}
	
}