package garage;

public abstract class Vehicle {
	
	private int seat;
	private int doornumber;
	private String size;
	private int wheel;
	private String ID;
	private String type;
	
	public Vehicle(int seat, int doornumber, String size, int wheel, String ID, String type) {
		this.setSeat(seat);
		this.setDoornumber(doornumber);
		this.setSize(size);
		this.setWheel(wheel);
		this.setID(ID);
		this.setType(type);
				
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getDoornumber() {
		return doornumber;
	}

	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", type=" + type + ", size=" + size + "]";

	
	}

	
	
	
}
