package Class;

public class Temperature {
	
	private double celsius;
	/**
	 * Default constructor.
	 * @param celsius
	 */
	public Temperature(double celsius){
		this.celsius = celsius;
	}
	
	public double getTemperatureInC(){
		return celsius;
	}
	
	/**
	 * Method that converts from Celsius in Kelvin.
	 * @return Returns temperature in Kalvin.
	 */
	public double getTemperatureInK(){
		return this.celsius + 273.15;
	}
	
	/**
	 * Method that converts from Celsius in fahrenheit.
	 * @return Returns Temperature in fahrenheits.
	 */
	public double getTemperatureInF(){
		return (this.celsius * 9/5 + 32); 
	}
	public void setTemperature(int celsius){
		this.celsius = (double) celsius;
	}
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
}
