import collections.HigherOrderArrayList;
import collections.List;
import inout.In;
import inout.Out;
import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) {
		 List<Integer> sunMeasures = new HigherOrderArrayList<>();
		 In.open("SunMeasurements.txt");
		 char hash = In.read(); 
		 while (In.done()) {
		 		int brightness = In.readInt(); 
		 		sunMeasures.add(brightness);
		  }
		 Out.println("Erste Beispiel - Filtering");
		 List<Integer> darkTime = (sunMeasures.filter(i -> i <= 30));
		 Out.println("Dunkel: " + darkTime.size() + " min");
		 List<Integer> middleTime = (sunMeasures.filter(i -> i > 30 && i <= 70));
		 Out.println("Mittel: " + middleTime.size() + " min");
		 List<Integer> lightTime = (sunMeasures.filter(i -> i > 70));
		 Out.println("Hell: " + lightTime.size() + " min\n");
		 
		 Out.println("Zweite Beispiel - Reduce");
		 int maxValue = sunMeasures.reduce(0, (a, b) -> Math.max(a, b));
		 Out.println("Maximum: " + maxValue + "\n");
		 
		 Out.println("Dritte Beispiel - Map");
		 List<String> chargingMeasures = new HigherOrderArrayList<>();
		 chargingMeasures = sunMeasures.map(i -> ((i >= 50) ? "C" : "N"));
		 String chargeResumed = chargingMeasures.reduce("", (a, b) -> a + b);
		 Out.println(chargeResumed + "\n");
		 
		 Out.println("Vierte Beispiel - Ladung");
		 List<Integer> chargingTime = (sunMeasures.filter(i -> i >= 50));
		 List<Double> chargingValues = new HigherOrderArrayList<>();
		 chargingValues = chargingTime.map(h -> (h * 0.01) * (h * 0.01));
		 List<Double> filteredValues = new HigherOrderArrayList<>();
		 filteredValues = (chargingValues.filter(i -> i < 0.5));
		 Double valuesAdded = filteredValues.reduce(0.0, (a, b) -> a + b);
		 Out.println("Tage-Strom-Produktion: " + valuesAdded.intValue() + " Amperestunden\n");
		 
		 Out.println("Fünfte Beispiel - foreach");
		 sunMeasures.forEach(i -> {
		 if (i >= 80) Out.println("Extreme Helligkeit: " + i);
		 });
	 }
}
