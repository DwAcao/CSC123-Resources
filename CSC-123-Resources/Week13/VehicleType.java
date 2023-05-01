
public class VehicleType {
	boolean primary;
	String name;
	public VehicleType(boolean primary, String name) {
		super();
		this.primary = primary;
		this.name = name;
	}
	public boolean isPrimary() {
		return primary;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "VehicleType [primary=" + primary + ", name=" + name + "]";
	}
	
	
}
