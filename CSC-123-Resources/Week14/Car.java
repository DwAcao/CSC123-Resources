
public class Car {
	
	private String color;
	private String make;
	private Engine engine;

	
	public Car(String color, String make) {
		super();
		this.color = color;
		this.make = make;
		engine=new Engine(200,6,20);
	}



	public String getColor() {
		return color;
	}


	public String getMake() {
		return make;
	}

	public Engine getEngine() {
		return engine;
	}

	
	
	
	
	class Engine implements IEngine{
		private int horsePower;
		private int numberofCylinders;
		private int mpg;
		
	
		
		public Engine(int horsePower, int numberofCylinders, int mpg) {
			super();
			this.horsePower = horsePower;
			this.numberofCylinders = numberofCylinders;
			this.mpg = mpg;
		}
		
		
		public int getHorsePower() {
			return horsePower;
		}
		public int getNumberofCylinders() {
			return numberofCylinders;
		}
		public int getMpg() {
			return mpg;
		}
		
		public class TurboCharger{
			
			
		}
		
	}
}
