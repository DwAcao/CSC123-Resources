
public class Vehicle {
	
	String make;
	String model;
	private static Vehicle self=new Vehicle();
	
	
	private Vehicle() {
	}

	public static Vehicle getInstance() {
		return self;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

}
