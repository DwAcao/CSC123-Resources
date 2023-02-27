import java.util.ArrayList;
import java.util.Objects;

public class Student extends Person {

	String program;
	String major;
    ArrayList<String> coursesRegistered;
	
	public Student(String fName, String lName, String ssn,String program, String major) {
		super(fName, lName, ssn);
		this.program=program;
		this.major=major;
		this.coursesRegistered=new ArrayList<String>();
		
	}
	
	public Student() {
		super();
	}

	//Copy constructor
	public Student(Student s) {
		super(s);
		this.major=s.getMajor();
		this.coursesRegistered=(ArrayList)s.coursesRegistered.clone();
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArrayList getCoursesRegistered() {
		return coursesRegistered;
	}
	
	public void registerCourse(String course) {
		this.coursesRegistered.add(course);
	}

	
	@Override
	public String toString() {
		return super.toString()+" : "+program+" : "+major;
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
		Student other = (Student) obj;
		return this.program.equalsIgnoreCase(other.program)
				&&this.major.equalsIgnoreCase(other.major);	}
	
	

}
