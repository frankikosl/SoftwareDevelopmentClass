class TimerTester{
  public static void main (String[] args){
    Timer time1 = new Timer();
    Timer time2 = new Timer(8000);
    Timer time3 = new Timer(12, 40, 50);
    Timer time4 = new Timer(12, 70, 50);


    Out.println("Time 1: " + time1);
    Out.println("Time 2: " + time2);
    Out.println("Time 3: " + time3);
    Out.println("Time 4: " + time4);
    Out.println("Decrement "+time2 +" um 600s: " + time2.decrement(600));
    Out.println("Decrement "+time2 +" um 12 min und 40s: " + time2.decrement(12, 40));
    Out.println("Decrement "+time2 +" um 1 Stunde, 5 min und 12s: " + time2.decrement(1, 5, 12));
    Out.println("Decrement "+time2 +" um "+ time3 + " : " + time2.decrement(time3));
    Out.print("Resetting " + time2 + ": ");
    time2.reset();
    Out.println(time2);
    Out.println("Diff von "+ time2 + " und " + time3 + " : " + time2.diff(time3));
    Out.println("Diff von "+time2 +" und "+ time3 + " im Sekunden : " + time2.diffSec(time3));
    Out.println("Diff von "+time3 +" und "+ time2 + " im Sekunden : " + time2.diffSec(time3));
  }
}
