package com.studentapp.models;

import java.util.List;

public class POSTUserPayload {

	private List<User> users;
	private Address address;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
