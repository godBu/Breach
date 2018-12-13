package garage;

public class Car extends Vehicle{
	
	private boolean sunroof;
	private boolean automatic;
	
	public Car(int seat, int doornumber, String size, int wheel, String ID, String type) {
		super(seat, doornumber, size, wheel, ID, type);
		
	}

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	

}
