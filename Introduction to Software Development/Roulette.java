import java.util.Arrays;
public class Roulette{
	
	public static void main(String [] args) {
        
        int kapital = 1000;
        int spielart = 0;
        boolean rouge = false;
        boolean pair = false;
        boolean manque = false;
        boolean win = false;
        int spiel = 0;
        int nummer = 0;
        int zahl = 38; 
        int einsatz = 0;
        int quit = 1;
        
        while (quit == 1){
            Out.print("Roulette\n===========\nSpielart (1 - Einfach/ 2 - Zahl): ");
            //Spielart
            while (!(spielart > 0 && spielart < 3)){ //definition der Grenzen
                spielart = In.readInt();
                if (spielart < 1 || spielart > 2){
                    Out.print("Ungueltige Eingabe!\nSpielart (1 - Einfach/ 2 - Zahl): ");
                }
            }
            nummer = (int)(Math.random() * 37); //generation der Nummer
            if (Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27,30, 32, 34, 36 ).contains(nummer)){ //Charakteristiken der Nummer
                rouge = true;
            }
            else{
                rouge = false;
            }
            if (nummer % 2 == 0){
                pair = true;
            }
            else{
                pair = false;
            }
            if (nummer < 19 && nummer > 0){
                manque = true;
            }
            else{
                manque = false;
            }
            if (spielart == 1){
                Out.print("Spiel (1 - Rouge, 2 - Noir, 3 - Pair, 4 - Impair, 5 - Manque, 6 - Passe): ");
                while (!(spiel > 0 && spiel < 7)){ //definition der Grenzen
                    spiel = In.readInt();
                    if (spiel < 1 || spiel > 6){
                        Out.print("Ungueltige Eingabe!\nSpiel (1 - Rouge, 2 - Noir, 3 - Pair, 4 - Impair, 5 - Manque, 6 - Passe): ");
                    }
                }
                Out.print("Einsatz (>= 1, <= 100, <= Kapital): ");
                while (!(einsatz > 0 && einsatz < 101 && einsatz <= kapital)){ //definition der Grenzen
                    einsatz = In.readInt();
                    if (einsatz < 1 || einsatz > 100){
                        Out.print("Ungueltige Eingabe!\nEinsatz (>= 1, <= 100, <= Kapital): ");
                    }
                }
                Out.println("Die Zahl ist " + nummer);
                if (nummer != 0){
                    if (rouge){
                        Out.print("Rouge, ");
                    }
                    else{
                        Out.print("Noir, ");
                    }
                    if (pair){
                        Out.print("Pair, ");
                    }
                    else{
                        Out.print("Impair, ");
                    }
                    if (manque){
                        Out.println("Manque.");
                    }
                    else{
                        Out.println("Passe.");
                    }
                    win = false;
                    switch (spiel) { //check ob man gewinnt hat
                        case 1:
                            if (rouge){
                                win = true;
                            }
                            break;
                        case 2:
                            if (!(rouge)){
                                win = true;
                            }
                            break;
                        case 3:
                            if (pair){
                                win = true;
                            }
                            break;
                        case 4:
                            if (!(pair)){
                                win = true;
                            }
                            break;
                        case 5:
                            if (manque){
                                win = true;
                            }
                            break;
                        case 6:
                            if (!manque){
                                win = true;
                            }
                            break;
                    }
                    if (win == true){
                        kapital = kapital + einsatz;
                        Out.println("Sie haben gewonnen!\nIhr neues Kapital: " + kapital);
                    }
                    else{
                        kapital = kapital - einsatz;
                        Out.println("Sie haben verloren!\nIhr neues Kapital: " + kapital);
                    }
                } else {
                    kapital = kapital - einsatz;
                    Out.println("Sie haben verloren!\nIhr neues Kapital: " + kapital);
                }
                

            }
            if (spielart == 2){
                Out.print("Zahl (0 - 36): ");
                while (!(zahl > (-1) && zahl < 37)){ //definition der Grenzen
                    zahl = In.readInt();
                    if (zahl < 0 || zahl > 36){
                        Out.print("Ungueltige Eingabe!\nZahl (0 - 36): ");
                    }
                }
                Out.print("Einsatz (>= 1, <= 100, <= Kapital): ");
                while (!(einsatz > 0 && einsatz < 101 && einsatz <= kapital)){ //definition der Grenzen
                    einsatz = In.readInt();
                    if (einsatz < 1 || einsatz > 100){
                        Out.print("Ungueltige Eingabe!\nEinsatz (>= 1, <= 100, <= Kapital): ");
                    }
                }
                Out.println("Die Zahl ist " + nummer);
                if (zahl == nummer){
                    kapital = kapital + einsatz;
                    Out.println("Sie haben gewonnen!\nIhr neues Kapital: " + kapital);
                }
                else {
                    kapital = kapital - einsatz;
                    Out.println("Sie haben verloren!\nIhr neues Kapital: " + kapital);
                }
            }
            Out.print("Weiterspielen? (1 - J oder 2 - N): ");
            do{
                quit = In.readInt();
                if (quit < 1 || quit > 2){
                    Out.print("Weiterspielen? (1 - J oder 2 - N): ");
                }
            }
            while (!(quit > 0 && quit < 3)); //definition der Grenzen              

            einsatz = 0;
            spielart = 0;
            spiel = 0;
            zahl = 38;
        }
    }
}