
public class VehicleCategory {
	
	boolean primary;
	String category;
	
	public VehicleCategory(boolean primary, String category) {
		super();
		this.primary = primary;
		this.category = category;
	}

	
	
	public boolean isPrimary() {
		return primary;
	}



	public String getCategory() {
		return category;
	}



	@Override
	public String toString() {
		return "VehicleCategory [primary=" + primary + ", category=" + category + "]";
	}
	
	

}
