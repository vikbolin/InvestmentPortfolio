
package org.codejunky.core;
public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	private String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String getMiddleName() {
		return middleName;
	}
	private void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}

}
