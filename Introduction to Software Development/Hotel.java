public class Hotel{
	
	public static void main(String [] args) {

	Out.println("\nHotelpreisberechnung");

	// Eingabe des Eingangswertes
	Out.print("\nBitte Personennummer eingeben: ");
    int personenAnzahl = In.readInt();
    Out.print("\nBitte Speisenummer eingeben: ");
	int mahlzeitAnzahl = In.readInt();
    Out.print("\nBitte Tagenummer eingeben: ");
    int tageAnzahl = In.readInt();
    int mahlzeitPreis;
    int mahlzeitGunstig;
	int zimmerAnzahl;
    int mahlzeitVoll;
    
    zimmerAnzahl = (personenAnzahl / 2) + (personenAnzahl % 2);

    Out.print("\nBenotigte Doppelzimmer Anzahl: " + zimmerAnzahl);

    //Preise sind auf cents kalkuliert. Am Ende werden sie durch 100 dividiert, damit man die Ergebnis auf Euro kriegt
    int preisVolle = (tageAnzahl % 7) * zimmerAnzahl * 9500;
    int preisErmassigt = (((tageAnzahl - (tageAnzahl % 7)) * zimmerAnzahl * 9500) * 90);
    //Übernachtungspreiskalkulation
    Out.print("\nAnzahl der Ubernachtungen mit vollem Zimmerpreis: " + (tageAnzahl % 7)+ " - " + (preisVolle / 100) + ".0 EUR");
    Out.print("\nAnzahl der Ubernachtungen mit Wochenrabatt: " + (tageAnzahl - (tageAnzahl % 7))+ " - " + (preisErmassigt /100/100) + ".0 EUR");
    
    
    //Mahlzeitpreiskalkulation

    mahlzeitGunstig = mahlzeitAnzahl / 3; 
    mahlzeitVoll = mahlzeitAnzahl - mahlzeitGunstig;
    mahlzeitPreis = mahlzeitVoll * 1400 + mahlzeitGunstig * 700;
    Out.print("\nAnzahl der Mahlzeiten fur 14 EUR: " + (mahlzeitVoll * personenAnzahl * tageAnzahl) + " - " + ((1400 * personenAnzahl * tageAnzahl)/100) + ".0 EUR");
    Out.print("\nAnzahl der vergunstigten Mahlzeiten: " + (mahlzeitGunstig * personenAnzahl * tageAnzahl) + " - " + ((tageAnzahl * personenAnzahl* 700) / 100) + ".0 EUR");

    //Gesamtpreiskalkulation
    int preisGesamt = ((mahlzeitPreis / 100) * tageAnzahl * personenAnzahl) + (preisVolle / 100) + (preisErmassigt/10000);
    Out.print("\nGesamtkosten: " + preisGesamt + "." + preisErmassigt % 100 + " EUR");
    
    /*
      Encrypted here you will find a suggestion/complaint for the Software development class. If you want to decrypt it, download ECDC.py from the link and see the message.
      https://github.com/frankikosl/programmingChallenges/blob/master/ECDC.py
      gSRH VCVIXRHV SZH HLNV FHVOVHH ORNRGZGRLMH. 
      dSB XZOXFOZGV RM XVMGH, RU R ZN TLRMT GL LFGKFG RM vFILH? mL EZOFV, VCXVKG ULI GSV vINNHHRTGARNNVIKIVRH, ZOO FHV DSLOV MFNYVIH.
      fHRMT RMG ZMW MLG ZOOLDRMT RUH RH ZOHL MVVWOVHH. rGH NZPRMT GSV HGFWVMGH GIB GL RMEVMG GSV DSVVO RMHGVZW LU OVZIMRMT SLD GSV DSVVO DLIPH.
      r GSRMP GSZG Z YVGGVI ZKKILZXS GL XOZHH DLFOW YV GL HVG GSV HGFWVMGH NRMWH UIVV. tLG Z KILYOVN? yV XIVZGREV GL HLOEV RG.
      r SZW ZOIVZWB HLNV qZEZ KILTIZNNRMT VCKVIRVMXV, ZMW WRW RG MZGFIZOOB FHRMT Z WLFYOV ZMW FHRMT RU/VOHV. 
      oZGVI R HZD GSZG BLF SZW GL YV ORNRGVW GL RMG ZMW ML XLMWRGRLMZOH. 
      gSRH WRWM'G NZPV NV OVZIM SLD GL YV Z YVGGVI HLUGDZIV WVEVOLKVI, RG QFHG NZWV NV DZHGV GRNV. 
      hL R OVZEV Z HFTTVHGRLM SVIV ULI GSV MVCG VCVIXRHVH GL OVG HGFWVMGH URMW GSVRI LDM HLOFGRLMH.
      */
    
    
			
	}
	
}