class BankVerwaltung{
    public static void main (String[] args){
        Bank raiffeisen = new Bank();
        char taste = '\n';
        String name;
        String address;
        int count = 0;
        String telefon;
        double rahmen;
        Customer[] customers = new Customer[100];
        int result;
        int kontoNr;
        double betrag;
        int vonKonto;
        int nachKonto;
        boolean durchgefuehrt;
        while (taste != 'q' ){
          Out.println("\n**************Bankverwaltung**************");
          Out.println("Kunde und Bankkonto anlegen ............ a");
          Out.println("Konto suchen ........................... s ");
          Out.println("Einzahlen .............................. e ");
          Out.println("Beheben ................................ b ");
          Out.println("Ueberweisung taetigen .................. t ");
          Out.println("Uebersicht drucken ..................... d ");
          Out.println("Beenden ................................ q ");
          Out.print("Welche Menueoption? [a|s|e|b|t|d|q]:  ");
          taste = In.readChar();
          if (taste == 'a'){
              Out.println("\n*** Anlegen von Kunde und Konto *** ");
              Out.print("Kundenname: ");
              name = In.readString();
              Out.print("Addresse: ");
              address = In.readString();
              Out.print("Telefonnummer: ");
              telefon = In.readString();
              Out.print("Ueberziehungsrahmen: ");
              rahmen = In.readDouble();
              if (count < 100){
              customers[count] = new Customer(raiffeisen.count, telefon, name, address);
              result = raiffeisen.createAccount(customers[count], rahmen);
              count++;
              }
              else{
                  result = raiffeisen.createAccount(customers[count], rahmen);
              }
              if (result != -1){
                  Out.println("Kontoinhaber   und   Konto   (#" + result + ") erfolgreich angelegt! ");
              }
              else{
                  Out.println("Konto konnte nicht erstellt werden! ");
              }
          }
          if (taste == 'b'){
              Out.println("*** Behebung taetigen ***");
              Out.print("Kontonummer: ");
              kontoNr = In.readInt();
              Out.print("Behebungsbetrag: ");
              betrag = In.readDouble();
              durchgefuehrt = raiffeisen.withdraw(kontoNr, betrag);
              if (durchgefuehrt) Out.println("Behebung erfolgreich durchgefuehrt!");
              else Out.println("Behebung konnte nicht durchgefuehrt werden!");
          }
          if (taste == 'e'){
              Out.println("*** Einzahlung taetigen ***");
              Out.print("Kontonummer: ");
              kontoNr = In.readInt();
              Out.print("Einzahlungsbetrag: ");
              betrag = In.readDouble();
              durchgefuehrt = raiffeisen.deposit(kontoNr, betrag);
              if (durchgefuehrt) Out.println("Einzahlung erfolgreich durchgefuehrt!");
              else Out.println("Einzahlung konnte nicht durchgefuehrt werden!");
          }
          if (taste == 'd'){
              if(raiffeisen.count == 0) Out.println("Keine Konten!");
              else raiffeisen.printAccounts();
          }
          if (taste == 's'){
              Out.println("*** Konto suchen *** ");
              Out.print("Name des Kunden: ");
              name = In.readString();
              if (raiffeisen.count == 0) Out.println("Keine Kunden!");
              else raiffeisen.printAccount(name);
          }
          if (taste == 't'){
              Out.println("\n*** Ueberweisung taetigen *** ");
              Out.print("Von Kontonummer: ");
              vonKonto = In.readInt();
              Out.print("Auf Kontonummer: ");
              nachKonto = In.readInt();
              Out.print("\nBetrag: ");
              betrag = In.readDouble();
              durchgefuehrt = raiffeisen.transfer(vonKonto, nachKonto, betrag);
              if (durchgefuehrt) Out.println("Ueberweisung erfolgreich durchgefuehrt!");
              else Out.println("Ueberweisung konnte nicht durchgefuehrt werden!");
          }
        }
    }

}
