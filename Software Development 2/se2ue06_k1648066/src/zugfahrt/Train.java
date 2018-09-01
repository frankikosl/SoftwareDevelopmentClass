package zugfahrt;
import java.util.*;

public class Train{
	private final String name;
	private SortedSet<Stop> stops;
	public Train(String name){
		this.stops = new TreeSet<>((s1, s2) -> s1.getTime().compareTo(s2.getTime()));
		this.name = name;
	}
	public void add(Stop stop) {
		this.stops.add(stop);
	}
	public SortedSet<Stop> getStops() {
		return stops;
	}
	public String getName() {
		return name;
	}
	public Station first() {
			return stops.first().getStation();

	}
	public Station last() {
			return stops.last().getStation();
	}
	public void remove(Stop stop) {
		stops.remove(stop);
	}
	public SortedSet<Stop> getStops(String bahnhof){
		SortedSet<Stop> results = new TreeSet<Stop>((s1, s2) -> s1.getTime().compareTo(s2.getTime()));
		for (Stop stop : stops) {
			if (stop.getStation().getName() == bahnhof) {
				results.add(stop);
			}
		}
		return results;
	}
	public void printString() {
		System.out.println(this.getName() + ":");

		for (Stop stop : this.getStops()) {
			System.out.println("\t" + stop.getTime().toString() + " " + stop.getStation().getName() + " (" + stop.getPlatform() + ")");
		}
	}
	public int compareTo(Train s2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
