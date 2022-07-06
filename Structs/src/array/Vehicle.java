package array;

public class Vehicle {
	private String model;
	private String manufacturer;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override public String toString() {
		return model + " - " + manufacturer;
	}
}
