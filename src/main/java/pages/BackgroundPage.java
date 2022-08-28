package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage {

	WebDriver driver;
	String background_color;

	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement set_SkyBlue_Background_button_Element;
	@FindBy(how = How.TAG_NAME, using = "body") WebElement body_Element;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement set_White_Background_button_Element;
	
	public boolean isExistsSetToBlueButton() {
		if(set_SkyBlue_Background_button_Element.isDisplayed()) 
			return true;
		else
			return false;
	}	
	public void clickSetSkyBlueBackgroundElement() {
		set_SkyBlue_Background_button_Element.click();
	}
	
	public boolean isExistsSetToWhiteButton() {
		if(set_White_Background_button_Element.isDisplayed()) 
			return true;
		else
			return false;
	}
	public void clickSetWhiteBackgroundElement() {
		set_White_Background_button_Element.click();
	}
	
	public boolean isBackgroundSkyBlue() {
		background_color = body_Element.getAttribute("style");
		System.out.println(background_color);
		if(background_color.equals("background-color: skyblue;")) {
			System.out.println("Background color is changed to blue");
			return true;
		}
		else
			return false;
	}
	
	public boolean isBackgroundWhite() {
		
		background_color = body_Element.getAttribute("style");
		System.out.println(background_color);
		if(background_color.equals("background-color: white;")) {
			System.out.println("Background color is changed to white");
			return true;
		}
		else
			return false;
		
	}
		
}
