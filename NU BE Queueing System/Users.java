package nube.model;

public class Users {
	private String firstName;
	private String lastName;
	private String studentID;
	private String email;
	private String department;
	private int year;
	private String contact;
	
	public Users(String firstName, String lastName, String studentID, String department, String email, int year, String contact) {
		this.firstName = firstName;
		this.lastName = lastName;
        this.studentID = studentID;
        this.department = department;
        this.email = email;
        this.year = year;
        this.contact = contact;
	}

	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
