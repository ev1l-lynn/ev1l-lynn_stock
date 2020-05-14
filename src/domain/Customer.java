package domain;


import java.util.Date;

public class Customer {
	private Long	   		customerId;
	private String    		email;
	private String    		lastname;
	private String    		gender;
	private Date			birthdate;
	private Double    		credits;
	public Customer(Long customerId2, String email2, String firstname, String lastname2, String gender2,
			Date birthdate2, Double credits2) {
		// TODO Auto-generated constructor stub
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Double getCredits() {
		return credits;
	}
	public void setCredits(Double credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", lastname=" + lastname + ", gender="
				+ gender + ", birthdate=" + birthdate + ", credits=" + credits + "]";
	}
	
}
