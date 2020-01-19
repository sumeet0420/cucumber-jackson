Feature: To form the JSON from datatable

@running
Scenario: To verify that the user is able to create the <b>User Information</b>
	Given the user wants to create a user
	 |name|job|designation|
	 |sumeet||ASSOCIATE|
	 |agrawal|automation engineer|SENIOR_ASSOCIATE|
	When the user fills in the following details
	|address|city|
	|Ohana|Indore|
	Then the json should be formed