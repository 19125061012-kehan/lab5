package lab5;

import java.util.Scanner;

public class MenuSystem {
	private Scanner scan;
	private MovieTheatre movieTheatre;
	
	public MenuSystem() {
		this.scan = new Scanner(System.in);
	}
	
	public void runMenu() {
		int section = 0, i = 0;
		Movie movie = null;
		do {
			System.out.println("1. Create a MovieTheatre (make it ¡®current¡¯)");
			System.out.println("2. Create a Movie (make it ¡®current¡¯ ");
			System.out.println("3. Select a RoomSchedule to make it ¡®current¡¯");
			System.out.println("4. Add Movie to a RoomSchedule");
			System.out.println("5. Display current RoomSchedule");
			System.out.println("0. Quit Program");
			section = scan.nextInt();		
			switch (section) {
				case 1:
					movieTheatre = obtainTheatreDetails();
					System.out.println("MovieTheatre create success!");
					System.out.println(movieTheatre);
					break;
				case 2:
					movie = obtainMovieDetails();
					System.out.println("Movie create success!");
					System.out.println(movie);
					break;
				case 3:
					i = setectRoom();
					break;
				case 4:
					movieTheatre.addMovieToRoomSchedule(i, movie);
					break;
				case 5:
					
					System.out.println("all the movies(currently-selected room of the current MovieTheatre):");
					RoomSchedule roomSchedule = movieTheatre.getRoomSchedule(i);
					for (int j = 0; j < roomSchedule.getNum(); j++) 
						System.out.println(roomSchedule.getMovie(j));
					break;
				default:
					break;
			}
		} while (section != 0);
	}
	
	public MovieTheatre obtainTheatreDetails() {
		System.out.println("input location:");
		String location = scan.next();
		System.out.println("input numberOfrooms:");
		int numberOfrooms = scan.nextInt();
		return new MovieTheatre(location, numberOfrooms);
	}
	
	public Movie obtainMovieDetails() {
		System.out.println("input name:");
		String name = scan.next();
		System.out.println("input duration:");
		int duration = scan.nextInt();
		return new Movie(name, duration);
	}
	
	public int setectRoom() {
		System.out.println("now room count:" + movieTheatre.getNumberOfrooms());
		System.out.println("input room number:");
		return scan.nextInt();
	}
}
