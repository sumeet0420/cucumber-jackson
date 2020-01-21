package com.studentapp.cucumber.stepdefinition;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.studentapp.models.Address;
import com.studentapp.models.POSTUserPayload;
import com.studentapp.models.User;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateUsersStepDefinition{

	POSTUserPayload payLoad = new POSTUserPayload();
	
	@Given("^the user wants to create a user$")
	public void the_user_wants_to_create_a_user(DataTable table) throws JsonProcessingException {
		//Modifying the way to create the List<Users> object. //Leveraging java8
		//List<User> users = table.asList(User.class);
		List<User> users = new ArrayList<User>();		 
		List<Map<String, String>> userMaps = table.asMaps(String.class, String.class);
		userMaps.forEach(row-> {
			String name = row.get("name");
			String job = row.get("job");
			String designation = row.get("designation");
			//double age = Double.parseDouble(row.get("age"));
			//users.add(new User(name ,job ,designation, age));
			users.add(new User(name ,job ,designation));
		});
		payLoad.setUsers(users);
	}
	
	
	@Then("^the user fills in the following details$")
	public void the_user_fills_in_the_address_details(DataTable table) throws JsonProcessingException {
		Address address= table.asList(Address.class).get(0);
		payLoad.setAddress(address);
	}
	
	@Then("^the json should be formed$")
	public void the_json_should_be_formed() throws JsonProcessingException {
	ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	objectMapper.setSerializationInclusion(Include.NON_EMPTY);
	String pay = objectMapper.writeValueAsString(payLoad);
	System.out.println("*************************");
	System.out.println(pay);
	System.out.println("*************************");
}
}
