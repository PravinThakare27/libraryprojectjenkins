package com.project.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class User {
	@Id
	String mobile;
	String firstname;
	String lastname;
	String email;
	String password;

	String address;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String firstname, String lastname, String email, String password, String mobile, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [mobile=" + mobile + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", address=" + address + "]";
	}

}
