import java.util.ArrayList;

public class CarMaker {
	String commonName;
	String country;
	String fullName;
	ArrayList<VehicleType> vehicleTypes=new ArrayList<VehicleType>();
	long mfrId;
	
	public CarMaker(String commonName, String country, String fullName, long mfrId) {
		super();
		this.commonName = commonName;
		this.country = country;
		this.fullName = fullName;
		this.mfrId = mfrId;
	}

	public String getCommonName() {
		return commonName;
	}

	public void addType(VehicleType vt) {
		this.vehicleTypes.add(vt);
	}
	public String getCountry() {
		return country;
	}

	public String getFullName() {
		return fullName;
	}

	public long getMfrId() {
		return mfrId;
	}

	@Override
	public String toString() {
	
		String s= "Name:" + commonName + "\n"
				+ "Country:" + country + "\n"
				+ "FullName:" + fullName+"\n\n"
				+ "Vehicles Made:\n";
		
		for(VehicleType vt:vehicleTypes) {
			s+=vt.getName()+"\n";
		}
		return s;
	}


	
	
	
}
