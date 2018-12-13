package garage;

public class Motorcycle extends Vehicle {
	
	private boolean helmet;
	private boolean handlebar;
	
	public Motorcycle(int seat, int doornumber, String size, int wheel, String ID, String type) {
		super(seat, doornumber, size, wheel, ID, type);
		
			
	}

	public boolean getHelmet() {
		return helmet;
		
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
		
	}
	public boolean getHandlebar() {
		return handlebar;
		
	}
	public void setHandlebar(boolean handlebar) {
		this.handlebar = handlebar;
	}
}
