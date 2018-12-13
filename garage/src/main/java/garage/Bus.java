package garage;

public class Bus extends Vehicle {
	
	private boolean hydraulicbrake;
	
	public Bus(int seat, int doornumber, String size, int wheel, String ID, String type) {
		super(seat, doornumber, size, wheel, ID, type);
		
	}

	public boolean isHydraulicbrake() {
		return hydraulicbrake;
	}

	public void setHydraulicbrake(boolean hydraulicbrake) {
		this.hydraulicbrake = hydraulicbrake;
	}

	
	

}
