package lab5;

public class Movie {
	private String name;
	private double adultPrice;
	private double childPrice;
	private int duration;
	
	public Movie() {}
	
	public Movie(String name, int duration) {
		setName(name);
		setDuration(duration);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAdultPrice() {
		return adultPrice;
	}
	
	public void setAdultPrice(double adultPrice) {
		if(adultPrice < 0)
		{
			System.out.println("Invalid adultPrice!");
			return;
		}
		this.adultPrice = adultPrice;
	}
	
	public double getChildPrice() {
		return childPrice;
	}
	
	public void setChildPrice(double childPrice) {
		if(childPrice < 0)
		{
			System.out.println("Invalid childPrice!");
			return;
		}
		this.childPrice = childPrice;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return name + " (" + duration + " minutes)";
	}
	
}
