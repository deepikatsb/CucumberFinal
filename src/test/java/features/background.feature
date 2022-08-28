#Scenario 1: Sky Blue Background; Given: "Set SkyBlue Background" button exists; 
#When: I click on the button; Then: the background color will change to sky blue
@BGChangeFeature
Feature: Index Page Changing the background Color Functionality

@toSkyBlueBG
Scenario: User Should be able to change the background color to Blue when user clicks set Blue Background Button
		Given "Set SkyBlue Background" button exists
		When I click on the button
		Then Background colour will change to Sky Blue
		
#Scenario 2: White Background Change; Given: "Set SkyWhite Background" button exists; When: I click on the button;
#Then: the background color will change to white

@toWhiteBG
Scenario: User Should be able to change the background color to white when user clicks set white Background Button
		Given "Set SkyWhite Background" button exists
		When I click on that button
		Then Background colour will change to white
		