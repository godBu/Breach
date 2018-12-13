package garage;
import java.util.*;

public class garageManager {
	
	private int capacity;
	
	private ArrayList<Vehicle> vstore = new ArrayList <>();
	
	public ArrayList<Vehicle> getVstore() {
		return vstore;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	
}		
	
