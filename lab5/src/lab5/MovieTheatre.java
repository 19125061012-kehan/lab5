package lab5;

public class MovieTheatre {
	private String location;
	private int openingHours;
	private int numberOfrooms;
	private RoomSchedule[] roomSchedules;
	private int roomNum;
	
	public MovieTheatre(String location, int numberOfrooms) {	
		setLocation(location);
		this.numberOfrooms = numberOfrooms;
		roomSchedules = new RoomSchedule[numberOfrooms];
		roomNum = 0;
		for (int i = 0; i < numberOfrooms; i++) {
			roomSchedules[i] = new RoomSchedule();
		}
	}
	
	public boolean addRoomSchedule(RoomSchedule roomSchedule) {
		if (roomSchedule == null)	return false;
		if(roomNum == 7)	return false;
		roomSchedules[roomNum++] = roomSchedule;
		return true;
	}
	
	public boolean addMovieToRoomSchedule(int i, Movie movie) {
		if (movie == null)	return false;	
		if (i >= numberOfrooms || i < 0)	return false;	
		return roomSchedules[i-1].addMovie(movie);
	}
	
	public Movie getMovieFromRoomSchedule(int i, int j) {
		return roomSchedules[i-1].getMovie(j);	
	}
	
	public RoomSchedule getRoomSchedule(int i) {
		if (i > numberOfrooms || i <= 0)	return null;
		return roomSchedules[i-1];
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	public int getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(int openingHours) {
		this.openingHours = openingHours;
	}
	
	public int getNumberOfrooms() {
		return numberOfrooms;
	}
	
	public String toString() {
		return location +  " (" + numberOfrooms + ")";
	}
}
