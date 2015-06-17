package Class;


public class Main {

	public static void main(String[] args) {
		Temperature s = new Temperature(1);
		System.out.println(s.getTemperatureInF());
		System.out.println(s.getTemperatureInK());
		
		Glass g1 = new Glass(5);
		
		System.out.println(g1.getTypeOfLiquid());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g1.getCurrentCapacity());
		
		g1.addLiquid("water", 3);
		
		System.out.println(g1.getTypeOfLiquid());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g1.getCurrentCapacity());
	}
	

}
