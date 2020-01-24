package com.studentapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {
	
	private String name;
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	private String job;
	private String designation;
	private double age;
	//@JsonInclude(Include.NON_EMPTY)
	/*
	 * private String job; private designation designation;
	 */
	/*
	 * public Double getAge() { return age; }
	 * 
	 * public void setAge(Double age) { this.age = age; }
	 * 
	 * private Double age;
	 * 
	 * public static enum designation { ASSOCIATE, SENIOR_ASSOCIATE }
	 */	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * public User(String name) { this.name = name; }
	 */

	/*
	 * public String getJob() { return job; }
	 * 
	 * public void setJob(String job) { this.job = job; }
	 * 
	 * public designation getDesignation() { return designation; }
	 * 
	 * public void setDesignation(designation designation) { this.designation =
	 * designation; }
	 * 
	 * public User(String name, String job, designation designation, Double age) {
	 * this.name = name; this.job = job; this.designation = designation; this.age =
	 * age; }
	 */		
		
}
