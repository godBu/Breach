package garage;

public class runner {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car (5, 3, "medium", 4, "x1", "Honda");
		Vehicle v2 = new Motorcycle (2, 0, "small", 2, "x2", "Yamaha");
		Vehicle v3 = new Bus (30, 0, "big", 4, "x3", "Mercedes");
		
		garageManager g1 = new garageManager();
		
		g1.getVstore().add(v1);
		g1.getVstore().add(v2);
		g1.getVstore().add(v3);
		
		for (Vehicle v : g1.getVstore()) {
			
			System.out.println(v);
			
		}
		
		

	}

}
