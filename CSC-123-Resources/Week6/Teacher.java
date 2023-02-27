import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends Person {

	String department;
	ArrayList<String> coursesTaught=new ArrayList<String>();
	
	public Teacher(String fName, String lName, String ssn,String department) {
		super(fName, lName, ssn);
		this.department=department;
	}

	public Teacher() {
		super();
	}

	public Teacher(Teacher t) {
		super(t);
		this.department=t.department;
		this.coursesTaught=(ArrayList)t.coursesTaught.clone();
		
	}
	
	public void addNewCourse(String course) {
		this.coursesTaught.add(course);
	}

	public String getDepartment() {
		return department;
	}

	public ArrayList<String> getCoursesTaught() {
		return coursesTaught;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+" : "+this.department;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(coursesTaught, other.coursesTaught) && Objects.equals(department, other.department);
	}
	
	

}
