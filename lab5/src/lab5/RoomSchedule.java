package lab5;
public class RoomSchedule {
	private Movie[] movies;
	private int num;
	public RoomSchedule() {
		movies = new Movie[6];
		num = 0;
	}
	
	public int getNum() {
		return num;
	}

	public boolean addMovie(Movie movie) {
		if (movie == null)	return false;
		if(num == 7)	return false;
		movies[num++] = movie;
		return true;
	}
	
	public Movie getMovie(int i) {
		if (i > num || i < 0)	return null;
		return movies[i];
	}
	
}
