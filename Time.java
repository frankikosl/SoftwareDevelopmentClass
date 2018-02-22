class Timer{
  int h, m, s;
  void set(int sec){
    h = sec / 3600;
    m = (sec % 3600) / 60;
    s = sec % 60;
  }
  public int seconds(){
    return this.h*3600 + this.m * 60 + this.s
  }
  public String toString(){
    return h + ":" + m + ":" + s;
  }
  public Timer diff(Timer subtract){
    //Methode,  die  es  ermöglicht  die  Zeitdifferenz  zwischen  zwei  Zeiten  zu  berechnen.  Es  soll  ein
    //neues  Timer-Objekt zurückgeben, das die Differenz der beiden Zeiten ausdrück
    difference  = this.seconds() - subtract.seconds();
    return set(difference)
  }
}
