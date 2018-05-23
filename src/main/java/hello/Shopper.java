package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="shoppers")
public class Shopper {
		
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	//private String phoneNumber;
	
	@Column(name="emailaddress")
	private String emailAddress;
	//private Date startDate;
	//private Date endDate;
	
	public Shopper() {
		
	}

	public Shopper(String firstName, String lastName,String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.emailAddress = emailAddress;
		
		
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

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
