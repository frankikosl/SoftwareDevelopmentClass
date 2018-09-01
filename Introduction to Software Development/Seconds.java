public class Seconds {
	
	public static void main(String [] args) {

        Out.println("Sekundenrechner:");
        Out.println("================");
        //Eingabe der Sekunden
        Out.println("Bitte Sekunden eingeben: ");
        int seconds;
        seconds = In.readInt();
    
        //Berechnung von Stunden, Minuten und Sekunden
        int hours = seconds / (60*60);
        int min = (seconds - (hours * (60*60)))/60;
        int sec = seconds - (hours * (60*60)) - (min * 60);
        //Ausgabe
        
        Out.print(seconds + " sind " + hours + ":" + min + ":" + sec);
        
        Out.println("-- END");
	}
	
}