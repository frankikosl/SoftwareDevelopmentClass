package main;

import zugfahrt.Station;
import zugfahrt.Stop;
import zugfahrt.Timetable;
import zugfahrt.Train;

public class app {
	public static void main(String[] args) {
	Train train = new Train("Donauwalzer");
	Train train2 = new Train("Steirerland");
	Station station = new Station("Linz");
	Station station2 = new Station("Salzburg");
	Station station3 = new Station("Graz");
	Station station4 = new Station("Wels");
	Station station5 = new Station("Kirchdorf");
	Station station6 = new Station("Rottenmann");
	Station station7 = new Station("Wien");
	Timetable times = new Timetable();
	Stop stop1 = new Stop(train, station7, 1, "9:10");
	Stop stop2 = new Stop(train2, station, 1, "10:12");
	Stop stop3 = new Stop(train2, station5, 2, "10:45");
	Stop stop4 = new Stop(train2, station6, 2, "11:18");
	Stop stop5 = new Stop(train2, station3, 1, "12:09");
	Stop stop6 = new Stop(train, station, 3, "10:46");
	Stop stop7 = new Stop(train, station4, 1, "11:03");
	Stop stop8 = new Stop(train, station2, 3, "12:33");
	
	
	train.add(stop1);
	train.add(stop6);
	train.add(stop7);
	train.add(stop8);
	train2.add(stop2);
	train2.add(stop3);
	train2.add(stop4);
	train2.add(stop5);
	
	station7.add(stop1);
	station.add(stop2);
	station5.add(stop3);
	station6.add(stop4);
	station3.add(stop5);
	station.add(stop6);
	station4.add(stop7);
	station2.add(stop8);
	
	times.add(new Stop(train2, station, 1, "10:12"));
	times.add(new Stop(train2, station5, 2, "10:45"));
	times.add(new Stop(train2, station6, 2, "11:18"));
	times.add(new Stop(train2, station3, 1, "12:09"));
	
	times.add(new Stop(train, station7, 1, "9:10"));
	times.add(new Stop(train, station, 3, "10:46"));
	times.add(new Stop(train, station4, 1, "11:03"));
	times.add(new Stop(train, station2, 3, "12:33"));

	System.out.println("Alle Züge der Bahnhöfe zeitlich sortiert: ");
	System.out.println(times.toStringStationsTime());
	System.out.println("Alle Züge der Bahnhöfe bei Bahnsteig sortiert: ");
	System.out.println(times.toStringStationsBahnsteig());
	System.out.println("Züge die nach " + station.getName() + " gehen: ");
	System.out.println(times.toStringTrainStop(station));
	System.out.println("Alle Züge:  ");
	System.out.println(times.toStringAllTrains());
	}
}
