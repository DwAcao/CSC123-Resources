import java.util.ArrayList;

public class CarManufacturer {
	
	String country;
	String formalName;
	String commonName;
	long id;
	ArrayList<VehicleCategory> vehicleCategories=new ArrayList<VehicleCategory>();
	
	
	public CarManufacturer(String country, String formalName, String commonName, long id) {
		super();
		this.country = country;
		this.formalName = formalName;
		this.commonName = commonName;
		this.id = id;
	}

	public void addCategory(VehicleCategory c) {
		
		vehicleCategories.add(c);
	}
	public String getCountry() {
		return country;
	}

	public String getFormalName() {
		return formalName;
	}

	public String getCommonName() {
		return commonName;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "CarManufacturer [country=" + country + ", formalName=" + formalName + ", commonName=" + commonName
				+ ", id=" + id + ", vehicleCategories=" + vehicleCategories + "]";
	}


}
