Feature: Login Feature

Scenario: User enters Username and Password
	Given  the Login Page is Opened
	When User enters lalitha as Username
	And user enters password123 as Password
	Then User will finds a TestMeApp Home Page