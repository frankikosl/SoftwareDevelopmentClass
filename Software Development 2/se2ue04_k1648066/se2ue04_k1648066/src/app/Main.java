package app;

import collections.ArrayList;
import collections.EntryBasedMap;
import collections.EntryBasedMap.EntryIterator;
import inout.In;
import inout.Out;

public class Main {

    public static void main(String[] args) {
    	
    	// TODO: Create shoppingList
    	EntryBasedMap<String, Integer> shoppingList = new EntryBasedMap<>();
        System.out.println("---------------------------------------------------");
        System.out.println("------------------ SHOPPING LIST ------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("Operationen:");
        System.out.println("(1) Neuen Eintrag hinzufuegen");
        System.out.println("(2) Loeschen eines Eintrags");
        System.out.println("(3) Einkaufsliste (Gegenstand + Anzahl) ausgeben");
        System.out.println("(4) Anzahl der zu kaufenden Gegenstaende ausgeben");
        System.out.println("(5) Anzahl der unterschiedlichen Gegenstaende");
        System.out.println("(X) Ende");
        System.out.println("---------------------------------------------------");

        System.out.print("\nIhre Eingabe: ");
        char c = In.readChar();
        while (c != 'X') {
            switch (c) {
                case '1':
                    System.out.print("Gegenstand: ");
                    String item = In.readWord();
                    System.out.print("Anzahl: ");
                    int number = In.readInt();
                    In.read();
                    
                    shoppingList.put(item, number);
                    
                    break;
                case '2':
                    System.out.print("Gegenstand: ");
                    String remItem = In.readWord();
                    
                    boolean removal = shoppingList.remove(remItem);
                    if (removal){
                    	Out.println(remItem + " von Einkaufsliste entfernt");
                    }
                    else {
                    	Out.println(remItem + " nicht auf Einkaufsliste, kann daher auch nicht entfernt werden");
                    }
                    
                    break;
                case '3':
                	
                	 for(EntryBasedMap<String, Integer>.Entry<String, Integer> e: shoppingList.entries) {
                		 if (e != null) {
                			 Out.println(e.getKey() + " -> " + e.getValue());
                		 }
                		   
                	  }
                    break;
                case '4':
                	int sumItems = 0;
                	for(EntryBasedMap<String, Integer>.Entry<String, Integer> e: shoppingList.entries) {
                		if (e != null) {
                			sumItems += e.getValue();
                		}
            		  }
                    Out.println(sumItems);
                    break;
                case '5':
                	int sumEntries = 0;
                	for(EntryBasedMap<String, Integer>.Entry<String, Integer> e: shoppingList.entries) {
            		    if (e != null) {
            		    	sumEntries++;
            		    }
            		  }
                    Out.println(sumEntries);
                    break;
                default:
                    System.out.println(String.format("%s ist keine valide Eingabe!", c));
            }
            System.out.print("\nIhre Eingabe: ");
            c = In.readChar();
        }
    }
}
