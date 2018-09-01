package zugfahrt;
import java.time.LocalTime;
public class Stop{
	private final Train train;
	private final Station station;
	private final Integer platform;
	private final String time;
	
	public Stop(Train train, Station station, int platform, String time){
		this.train = train;
		this.station = station;
		this.platform = platform;
		this.time = time;
	}
	public String toString() {
		return (time + " " + station.getName() + " (" + platform + ")");
	}
	public Integer getPlatform() {
		return platform;
	}
	public String getTime() {
		return time;
	}
	public Train getTrain() {
		return train;
	}
	public Station getStation() {
		return station;
	}


}
