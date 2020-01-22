# https://agileforall.com/just-enough-regular-expressions-for-cucumber/
Feature: To form the JSON from datatable
@running
Scenario: To verify that the user is able to create the <b>User Information</b>
	Given the user wants to create a user
	 |name|job|designation|age|
	 |sumeet||ASSOCIATE|27|
	 |agrawal|automation engineer|SENIOR_ASSOCIATE|30|
	When the user fills in the following details
	|address|city|
	|Ohana|Indore|
	Then the xml1 should be formed