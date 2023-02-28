import java.util.Objects;
import java.util.Scanner; //just for example 


/**********************************
 * 2 - Class declaration2
 **********************************/

public class Person {
	
	/**********************************
	 * 2 -FIELDS
	 * 
	 * Fields are just variables. Variables are called fields 
	 * when they are declared in this area. Fields are "global" variables 
	 * they are available throughout the class. The "public" fields are available within the class as well as 
	 * outside the class 
	 **********************************/
	
	private String firstName;
	private String lastName;
	private String ssn;
	
	
	/**
	* Constructor to create object of class <code>Person</code>
	*
	* @param  fName  First name
	* @param  lName  Last name
	* @param  ssn  Social Security Number
	* 
	*/
	

	public Person(String fName, String lName, String ssn) {
		setFirstName(fName);
		setLastName(lName);
		setSSN(ssn);
		
	}

	/**
	* Constructor with no arguments
	*/
	public Person() {}

	/**
	* Constructor to create a deep copy of an object of class <code>Person</code>
	*
	* @param  p  An object of the class <code>Person</code> whose copy is being sought
	*/
	
	public Person(Person p) {
		this.firstName=p.getFirstName();
		this.lastName=p.getLastName();
		this.ssn=p.getSSN();
	}	
	
	/**
	* Sets first name for this object
	*
	* @param  s  First Name
	*/
	
	public void setFirstName(String s) {
		firstName=s;
		
	}

	/**
	* Sets last name for this object
	*
	* @param  s  Last Name
	*/
	
	public void setLastName(String s) {
		lastName=s;
	}

	/**
	* Sets Social Security Number for this object
	*
	* @param  s  Social Security Number
	*/
	
	public void setSSN(String s) {
		ssn=s;
	}

	/**
	* Returns first name for this object
	*
	* @return First Name
	*/
	
	public String getFirstName() {
		return firstName;
	}
	
	/**
	* Returns first name for this object
	*
	* @return Last Name
	*/
	public String getLastName() {
		return lastName;
	}
	
	/**
	* Returns first name for this object
	*
	* @return Social Security Number
	*/

	public String getSSN() {
		return ssn;
	}
	
	
	/**
	 * 
	 * toString() method is inherited by the super class Object. This returns a String representation of the object. 
	 */
	
	
	@Override
	public String toString() {
		
		return firstName+" : "+lastName+" : "+ssn; 
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		
		return this.firstName.equalsIgnoreCase(other.getFirstName())
				&&this.lastName.equalsIgnoreCase(other.getLastName())
						&&this.ssn.equalsIgnoreCase(other.getSSN());

	}
	
	
}
