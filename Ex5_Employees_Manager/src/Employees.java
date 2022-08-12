

public class Employees {
	private String surName, firstName;
	private Date birthday, dateOfEmployment;

	public Employees(String surName, String firstName, Date birthday, Date dateOfEmployment) {
		this.surName = surName;
		this.firstName = firstName;
		this.birthday = birthday;
		this.dateOfEmployment = dateOfEmployment;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fullname: " + this.surName + " - " + this.firstName + "\n" + "Birthday: " + this.birthday + "\n"
				+ "Date of employment: " + this.dateOfEmployment;
	}
}

