package zugfahrt;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Timetable{
	private SortedSet<Station> stations;
	private SortedSet<Train> trains;
	
	public Timetable() {
		this.stations = new TreeSet<>((s1, s2) -> {
			return s1.getName().compareTo(s2.getName());
		});
		
		this.trains = new TreeSet<>((s1, s2) -> {
			String time1 = null;
			String time2 = null;
		for(Stop st : s1.getStops()) {
			if(st.getStation().equals(s1.first())) {
				time1 = st.getTime();
				break;
			}
		}
		for(Stop st : s2.getStops()) {
			if(st.getStation().equals(s2.first())) {
				time2 = st.getTime();
				break;
			}
		}
		if((time1 == null ? time2 == null : time1.equals(time2))) 
			return s1.first().getName().compareTo(s2.first().getName());
		else
			return time1.compareTo(time2);
			
		});

	}
	public void add(Stop stop) {
		stations.add(stop.getStation());
		trains.add(stop.getTrain());
	}
	public void remove(Stop stop) {
		for (Train train : trains) {
			if (train.getName() == stop.getTrain().getName()) {
				train.remove(stop);
				break;
			}
		}
		for (Station station : stations) {
			if (station.getName() == stop.getStation().getName()) {
				station.remove(stop);
				break;
			}
		}
	}
	public SortedSet<Station> getStations(){
		return stations;
	}
	public SortedSet<Train> getTrains(){
		return trains;
	}
	public String toStringStationsTime(){
		String string = "";
		for (Station station : stations) {
			station.toStringTime();
		}
		return string;
	}
	public String toStringStationsBahnsteig(){
		String string = "";
		for (Station station : stations) {
			station.toStringBahnsteig();
		}
		return string;
	}
	public String toStringAllTrains(){
		String string = "";
		for (Train train : trains) {
			train.printString();
		}
		return string;
	}
	public String toStringTrainStop(Station station){
		String string = "\n";
		boolean printStation = false;
		for (Train train : trains) {
			printStation = false;
			for (Stop stop : train.getStops()) {
				if (stop.getStation().equals(station)) {
					printStation = true;
					string += train.getName() + "\n";
				}
				if (printStation) {
					string += ("\t" + stop.getTime().toString() + " " + stop.getStation().getName() + " (" + stop.getPlatform() + ")\n");
				}
			}
			string += "\n";
		}
		return string;
	}
}

		
		