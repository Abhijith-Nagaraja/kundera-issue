package com.example;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact
{

	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String contactId, String lastName, String firstName, String emailId) {
		setContactId(contactId);
		setLastName(lastName);
		setFirstName(firstName);
		setEmailId(emailId);
	}

	@Column(name = "CONTACT_ID")
	String contactId;

	@Column(name = "LAST_NAME")
	String lastName;

	@Column(name = "FIRST_NAME")
	String firstName;

	@Column(name = "EMAIL_ID")
	String emailId;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


}
