package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BackgroundPage;
import pages.TestBase;

public class backgroundStepDefinition extends TestBase {
	
	BackgroundPage backgroundPage;
	@Before
	public void method() {
		initDriver();
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
		
	}
	@When("^I click on the button$")
	public void i_click_on_the_button(){
		backgroundPage.clickSetSkyBlueBackgroundElement();
	}
	    

	@Then("^Background colour will change to Sky Blue$")
	public void background_colour_will_change_to_Sky_Blue(){
		Assert.assertEquals("Background Not Blue", true, backgroundPage.isBackgroundSkyBlue());
	}

	@Given("{string} button exists")
	public void button_exists(String button_name) {
		if(button_name.equals("Set SkyBlue Background")) {
			Assert.assertEquals("Button does not exists", true, backgroundPage.isExistsSetToBlueButton());
		}else if(button_name.equals("Set SkyWhite Background")) {
			Assert.assertEquals("Button does not exists", true, backgroundPage.isExistsSetToWhiteButton());
		}
	}
	@When("I click on that button")
	public void i_click_on_that_button() {
		//To change BG to Blue first
		backgroundPage.clickSetSkyBlueBackgroundElement();
		//Now change BG to white
		backgroundPage.clickSetWhiteBackgroundElement();	   
	}
	@Then("Background colour will change to white")
	public void background_colour_will_change_to_white() {
		Assert.assertEquals("Background Not white", true, backgroundPage.isBackgroundWhite());
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
