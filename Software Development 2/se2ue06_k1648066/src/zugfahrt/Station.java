package zugfahrt;

import java.util.SortedSet;
import java.util.TreeSet;

public class Station{
	private final String name;
	private SortedSet<Stop> stops;
	
	public Station (String name){
		this.stops = new TreeSet<>((s1, s2) -> {
			if(s1.getTime().equals(s2.getTime()))
				return s1.getPlatform() - s2.getPlatform();
			else
				return s1.getTime().compareTo(s2.getTime());		
		});
		this.name = name;
	}
	public void add(Stop stop) {
		stops.add(stop);
	}
	public void remove(Stop stop) {
		stops.remove(stop);
	}
	public String getName() {
		return name;
	}
	public SortedSet<Stop> getStopsTime() {
		return stops;
	}
	public SortedSet<Stop> getStopsBahnsteig() {
		SortedSet<Stop> platStops = new TreeSet<>((s1, s2) -> {
			if(s1.getPlatform().equals(s2.getPlatform()))
				return s1.getTime().compareTo(s2.getTime());	
			else
				return s2.getPlatform() - s1.getPlatform();
		});

		for (Stop stop : stops) {
			platStops.add(stop);
		}
		return platStops;
	}
	public SortedSet<Train> getTrains(){
		SortedSet<Train> trains = new TreeSet<>();
		for(Stop stop : stops) {
			trains.add(stop.getTrain());
		}
		return trains;
	}
	public void toStringBahnsteig() {
		System.out.println("Bahnhof " + this.getName());

		for (Stop stop : this.getStopsBahnsteig()) {
			System.out.println("\t" + stop.getTime().toString() + " " + stop.getTrain().last().getName() + " (" + stop.getPlatform() + ")");
		}
	}
	public void toStringTime() {
		System.out.println("Bahnhof " + this.getName());

		for (Stop stop : this.getStopsTime()) {
			System.out.println("\t" + stop.getTime().toString() + " " + stop.getTrain().last().getName() + " (" + stop.getPlatform() + ")");
		}
	}
}
