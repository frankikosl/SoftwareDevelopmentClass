class Customer{
  int kundenNummer;
  String name;
  String addresse;
  String telefonNr;
  public Customer(){
    this.kundenNummer = 0;
    this.telefonNr = "";
    this.name = "";
    this.addresse = "";
  }
  public Customer(int kunde, String telefon, String nameKunde, String addresseKunde){
    this.kundenNummer = kunde;
    this.telefonNr = telefon;
    this.name = nameKunde;
    this.addresse = addresseKunde;
  }
}
