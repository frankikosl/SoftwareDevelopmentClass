public class uhrzeitkalkulation{
	
	public static void main(String [] args) {
        
        //deklaration der Variabeln
        int minuten = 0, stunden = 0;
        String[] stunde = {"ein", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zehn", "elf", "zwoelf"};
        String[] minute = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn", "elf", "zwoelf", "dreizehn", "vierzehn", "fuenfzehn", "sechszehn", "siebzehn", "achtzehn", "neunzehn", "zwanzig", "einundzwanzig", "zweiundundzwanzig", "dreiundzwanzig", "vierundzwanzig", "fuenfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig", "dreissig", "einunddreissig", "zweiunddreissig", "dreiunddreissig", "vierunddreissig", "fuenfunddreissig", "sechsunddreissig", "siebenunddreissig", "achtunddreissig", "neununddreissig", "vierzig", "einundvierzig", "zweiundvierzig", "dreiundvierzig", "vierundvierzig", "fuenfundvierzig", "sechsundvierzig", "siebenundvierzig", "achtundvierzig", "neunundvierzig", "fuenfzig", "einundfuenfzig", "zweiundfuenfzig", "dreiundfuenfzig", "vierundfuenfzig", "fuenfundfuenfzig", "sechsundfuenfzig", "siebenundfuenfzig", "achtundfuenfzig", "neunundfuenfzig"};

        String eingabe = "";
        //eingabe der Uhrzeit
        Out.print("Eingabe: ");
        eingabe = In.readString();
        String[] parts = eingabe.split(" ");
        minuten = Integer.parseInt(parts[1]);
        stunden = Integer.parseInt(parts[0]);
        //ob uhrzeit in der grenze steht
        if (stunden > 12 || stunden < 1 || minuten >= 60 || minuten <= 0){
            Out.println ("Eingabe: " + eingabe + " -> Ausgabe: ***");
        }
        else {
            if (minuten == 45 || minuten == 15 || minuten == 0 || minuten == 30){
                switch (minuten){
                    case 0:
                    Out.println ("Eingabe: " + eingabe + " -> Ausgabe: punkt " + stunde[(stunden - 1)] + " uhr" );
                    break;
                    case 15:
                    Out.println ("Eingabe: " + eingabe + " -> Ausgabe: viertel nach " + stunde[(stunden - 1)] + " uhr");
                    break;
                    case 30:
                    if (stunden == 12){
                        Out.println ("Eingabe: " + eingabe + " -> Ausgabe: halb " + "ein" + " uhr");    
                    }
                    else{
                        Out.println ("Eingabe: " + eingabe + " -> Ausgabe: halb " + stunde[(stunden)] + " uhr");
                    }
                    break;
                    case 45:
                    if (stunden == 12){
                        Out.println ("Eingabe: " + eingabe + " -> Ausgabe: dreiviertel " + "ein" + " uhr");    
                    }
                    else{
                        Out.println ("Eingabe: " + eingabe + " -> Ausgabe: dreiviertel " + stunde[(stunden)] + " uhr");
                    }
                    
                    break;
                }
            }
            else{
                Out.println ("Eingabe: " + eingabe + " -> Ausgabe: " + stunde[stunden - 1] + " uhr " + minute[minuten - 1]);
            }
        }
    }
}