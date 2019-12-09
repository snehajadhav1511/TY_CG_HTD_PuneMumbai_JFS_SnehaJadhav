
/**
 * @author Sneha 
 * This class declare as final According to industrial class
 */
public final class Bus {
	private final int seats;
	private final String name;

	public Bus(int seats, String name) {
		this.name = name;
		this.seats = seats;

	}

	public int getSeats() {
		return seats;
	}

	public String getName() {
		return name;
	}

}
