class Timer{
  int h, m, s, init;
  public Timer(int sec){
    if (sec < 0){
      this.h = 24;
      this.m = 0;
      this.s = 00;
      this.init = 8640;
    }
    else{
      this.h = sec / 3600;
      this.m = (sec % 3600) / 60;
      this.s = sec % 60;
      this.init = sec;
    }
  }
  public Timer(){
    this.h = 24;
    this.m = 0;
    this.s = 00;
    this.init = 8640;
  }
  public Timer(int hour, int minutes, int seconds){
    if (minutes > 60 || seconds > 60 || hour < 0 || minutes < 0 || seconds < 0){
      this.h = 24;
      this.m = 0;
      this.s = 00;
      this.init = 8640;
    }
    else{
      this.h = hour;
      this.m = minutes;
      this.s = seconds;
      this.init = this.seconds();
    }
  }
  public int seconds(){//amount of seconds in a given time
    return this.h*3600 + this.m * 60 + this.s;
  }
  public Timer decrement(int sec){ //Subtracting a value from a given time
    if (this.seconds() - sec < 0){
      Timer decr = new Timer(0);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
    else{
      int decrement  = this.seconds() - sec;
      Timer decr = new Timer(decrement);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
  }
  public Timer decrement(int min, int sec){
    if (this.seconds() - (sec + min*60) < 0){
      Timer decr = new Timer(0);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
    else{
      int decrement  = this.seconds() - (sec + min*60);
      Timer decr = new Timer(decrement);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
  }
  public Timer decrement(int hour, int min, int sec){
    if (this.seconds() - (sec + min*60 + hour * 3600) < 0){
      Timer decr = new Timer(0);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
    else{
      int decrement  = this.seconds() -  (sec + min*60 + hour * 3600);
      Timer decr = new Timer(decrement);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
  }
  public Timer decrement(Timer subtract){
    if (this.seconds() - (subtract.seconds()) < 0){
      Timer decr = new Timer(0);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
    else{
      int decrement  = this.seconds() -  subtract.seconds();
      Timer decr = new Timer(decrement);
      this.h = decr.h;
      this.m = decr.m;
      this.s = decr.s;
      return this;
    }
  }

  public String toString(){
    return h + ":" + m + ":" + s;
  }
  public Timer diff(Timer subtract){
    //Methode,  die  es  ermöglicht  die  Zeitdifferenz  zwischen  zwei  Zeiten  zu  berechnen.  Es  soll  ein
    //neues  Timer-Objekt zurückgeben, das die Differenz der beiden Zeiten ausdrück
    int difference = 0;
    if (this.seconds() > subtract.seconds()){
    difference  = this.seconds() - subtract.seconds();
    }
    else{
    difference  = subtract.seconds() - this.seconds();
    }
    Timer diff = new Timer(difference);
    return diff;
  }
  public long diffSec(Timer subtract){//Methode,  die  es  ermöglicht  die  Zeitdifferenz  zwischen  zwei  Zeiten  zu  berechnen.  Es  soll
    //dabei die Differenz in Sekunden (long) zurückgeben werden.
    long difference = 0;
    if (this.seconds() > subtract.seconds()){
    difference  = this.seconds() - subtract.seconds();
    }
    else{
    difference  = subtract.seconds() - this.seconds();
    }
    return difference;
  }
  public void reset(){//Methode, die es ermöglicht, ein Zeit-Objekt auf den Ausgangszeitpunt
    //der Initialisierung des Objekts zu setzen
    this.h = this.init / 3600;
    this.m = (this.init % 3600) / 60;
    this.s = this.init % 60;
  }

}
