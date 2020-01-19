package com.studentapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {
	
	private String name;
	//@JsonInclude(Include.NON_EMPTY)
	private String job;
	private designation designation;
	
	public static enum designation {
	ASSOCIATE, SENIOR_ASSOCIATE
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public designation getDesignation() {
		return designation;
	}

	public void setDesignation(designation designation) {
		this.designation = designation;
	}

	public User(String name, String job, com.studentapp.models.User.designation designation) {
		this.name = name;
		this.job = job;
		this.designation = designation;
	}
		
		
}
