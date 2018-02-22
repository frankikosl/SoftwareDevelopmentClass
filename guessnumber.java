public class guessnumber{
	
	public static void main(String [] args) {
        
        //deklaration der Variabeln
        Out.print("Zahlenraten\n===========\nBitte stellen Sie die Anzahl der Runden ein [1 bis 20]: ");
        int schwierigkeit = 0;
        int gesamtRunden = 0;
        int runde = 1;
        int versuche = 0;
        int versuchNr = 1;
        int versuch = 0;
        int sumPunkte = 0;
        int punkte = 0;
        int rundeGewonnen = 0;
        int rundeVerloren = 0;
        int nummer = 0;
        
        //Auswahl der Anzahl der Runden
        while (!(gesamtRunden > 0 && gesamtRunden < 21)){ //definition der Grenzen
			gesamtRunden = In.readInt();
			if (gesamtRunden < 1 || gesamtRunden > 20){
				Out.print("Bitte stellen Sie die Anzahl der Runden ein [1 bis 20]: ");
			}
		}
        if (gesamtRunden == 1){
            Out.println("Es wird " + gesamtRunden + " Runde gespielt!");
        }
        else {
            Out.println("Es werden " + gesamtRunden + " Runden gespielt!");
        }
        while (runde <= gesamtRunden){
            //Auswahl der Schwierigkeit
            Out.print("Schwierigkeit des " + runde + ". Spiels [superleicht=1, leicht=2, mittel=3, schwer=4]: ");
            while (!(schwierigkeit > 0 && schwierigkeit < 5)){ //definition der Grenzen
                schwierigkeit = In.readInt();
                if (schwierigkeit < 1 || schwierigkeit > 4){
                    Out.print("KEINE GUELTIGE OPTION!\nBitte stellen Sie die Anzahl der Runden ein [1 bis 20]:  ");
                }
            }
            //Setzung der Punkte und Versuche nach Schwierigkeit
            if (schwierigkeit == 1){
                versuche = 9999999;
                punkte = 1;
                Out.println("Zufallszahl generiert. Sie haben unbegrenzte Versuche und es geht um 1 Punkt!");
            }
            else if (schwierigkeit == 2){
                versuche = 20;
                punkte = 2;
                Out.println("Zufallszahl generiert. Sie haben 20 Versuche und es geht um 2 Punkte!");
            }
            else if (schwierigkeit == 3){
                versuche = 15;
                punkte = 3;
                Out.println("Zufallszahl generiert. Sie haben 15 Versuche und es geht um 3 Punkte!");
            }
            else if (schwierigkeit == 4){
                versuche = 4;
                punkte = 7;
                Out.println("Zufallszahl generiert. Sie haben 4 Versuche und es geht um 7 Punkte!");
            }
            //generation der Nummer
            nummer = (int)(Math.random() * 100)+1;
            
            while (versuchNr <= versuche){ //Anzahl der versuche wird uberprüft
                Out.print(versuchNr + ". Versuch: ");
                versuch = In.readInt();
                if (versuch == nummer){ //Wenn man die Nummer findet
                    Out.println ("Sie haben die Zahl erraten!");
                    sumPunkte = sumPunkte + punkte + 1;
                    rundeGewonnen += 1;
                    rundeVerloren -= 1;
                    break; 
                }
                else if (versuch > nummer){ //Wenn mann nicht findet aber kleiner als versuch ist
                    if (versuchNr == versuche){
                         Out.println ("Nicht erraten. Die gesuchte Zahl war " + nummer + ".");
                    }
                    else{
                        Out.println ("Nicht erraten. Die gesuchte Zahl ist KLEINER.");
                    } 
                }
                else if (versuch < nummer){ //Wenn mann nicht findet aber groesser als versuch ist
                    if (versuchNr == versuche){
                        Out.println ("Nicht erraten. Die gesuchte Zahl war " + nummer + ".");
                    }
                    else{
                        Out.println ("Nicht erraten. Die gesuchte Zahl ist GROESSER.");
                    } 
                }
                versuchNr++;
            }
            //ende der Versuch
            versuch = 0;
            versuchNr = 1;
            sumPunkte -= 1;
            rundeVerloren += 1;
            runde++;
            schwierigkeit = 0;
        }
        //Ergebnis am Ende
        if (rundeGewonnen > rundeVerloren){
            Out.println ("Punktebilanz nach " + gesamtRunden + " Spielen: " + sumPunkte + ". Sie haben mehr Spiele gewonnen als verloren (gewonnen: " + rundeGewonnen + " / verloren: " + rundeVerloren + ")");    
        }
        if (rundeGewonnen == rundeVerloren){
            Out.println ("Punktebilanz nach " + gesamtRunden + " Spielen: " + sumPunkte + ". Sie haben genauso viele Spiele gewonnen als verloren (gewonnen: " + rundeGewonnen + " / verloren: " + rundeVerloren + ")");    
        }
        if (rundeGewonnen < rundeVerloren){
            Out.println ("Punktebilanz nach " + gesamtRunden + " Spielen: " + sumPunkte + ". Sie haben mehr Spiele verloren als gewonnen (gewonnen: " + rundeGewonnen + " / verloren: " + rundeVerloren + ")");    
        }
    }
}