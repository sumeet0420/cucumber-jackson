package com.studentapp.cucumber.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

//import org.kohsuke.rngom.ast.builder.Include;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.studentapp.models.Address;
import com.studentapp.models.POSTUserPayload;
import com.studentapp.models.User;

//import com.studentapp.models.User.designation;
//import cucumber.ta
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import io.restassured.mapper.ObjectMapper;

public class CreateUsersStepDefinition{

	POSTUserPayload payLoad = new POSTUserPayload();
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Given("^the user wants to create a user$")
	public void the_user_wants_to_create_a_user(DataTable table) throws JsonProcessingException {

		//Modifying the way to create the List<Users> object. //Leveraging java8
		//List<User> users = table.asList(User.class);
		//List<User> users = new ArrayList<User>();		 
		List<Map<String, String>> userMaps = table.asMaps(String.class, String.class);
		List<User> users = userMaps.stream()
						.map(user->objectMapper.convertValue(user, User.class))
						.collect(Collectors.toList());
		/*
		 * userMaps.forEach(row-> { String name = row.get("name"); String job =
		 * row.get("job"); designation designation = Enum.valueOf(designation.class,
		 * row.get("designation")); double age = Double.parseDouble(row.get("age"));
		 * users.add(new User(name ,job ,designation, age)); //String designation =
		 * row.get("designation"); //double age = Double.parseDouble(row.get("age"));
		 * //users.add(new User(name ,job ,designation, age)); });
		 */
		payLoad.setUsers(users);
	}
	
	
	@Then("^the user fills in the following details$")
	public void the_user_fills_in_the_address_details(DataTable table) throws JsonProcessingException {
		Address address= table.asList(Address.class).get(0);
		payLoad.setAddress(address);
	}
	
	@Then("^the (?:xml1|json) should be formed$")
	public void the_json_should_be_formed() throws JsonProcessingException {
	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	objectMapper.setSerializationInclusion(Include.NON_EMPTY);
	String pay = objectMapper.writeValueAsString(payLoad);
	System.out.println("*************************");
	System.out.println(pay);
	System.out.println("*************************");
}
}
