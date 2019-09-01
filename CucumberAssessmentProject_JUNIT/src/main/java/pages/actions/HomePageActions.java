package pages.actions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.HomePageLocator;
import utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocator homePageLocator = null;

	//constructor 
	public HomePageActions() {

		this.homePageLocator = new HomePageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocator);
	}

	//Method to click on the SignIn button	
	public void clickOnSignInLink() {

		homePageLocator.signInLink.click();

	}

	


}
