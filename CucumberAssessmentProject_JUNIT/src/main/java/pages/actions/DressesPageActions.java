package pages.actions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.DressesPageLocator;
import utils.SeleniumDriver;

public class DressesPageActions {
	
	DressesPageLocator dressesPagelocator = null;
	
	String dressSelected;
	
	public DressesPageActions() {
		
		this.dressesPagelocator = new DressesPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), dressesPagelocator);
	}
	
	//Method to move to Dresses megamenu

		public void moveToMegaMenu(String menuName) {

			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(dressesPagelocator.dresses).build().perform();

		}

		//method to click on submenu of Dresses
		public void clickDressesSubMenu(String subMenu) {

			if (subMenu.equalsIgnoreCase("summer dresses")) {					
				dressesPagelocator.summerDressesMenu.click();
			}
		}

		public void verifySummerDressesPage(String expectedPageHeading) {

			String actualPageHeading = dressesPagelocator.summerDressPage.getText().toLowerCase();
			Assert.assertEquals(expectedPageHeading, actualPageHeading);

		}
		
		public void moveToDress() {
			
			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(dressesPagelocator.moveToDressElem).build().perform();
			dressSelected = dressesPagelocator.selectedDress.getText().trim();
			//System.out.println("Dress Name" + dressesPagelocator.selectedDress.getText().trim());
		
		}
		
		public void addToCart() {
			
			dressesPagelocator.addToCart.click();
			dressesPagelocator.closeSmallWindowIcon.click();
			
		}
		
		public void viewCart() {
			
			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(dressesPagelocator.cart).build().perform();
			dressesPagelocator.cart.click();
			
		}
		
		public void verifyCart() {
			System.out.println("Product Name : " + dressesPagelocator.productName.getText() );
			System.out.println("Product Quantity : " + dressesPagelocator.productQuantity.getAttribute("value"));
			
			String actualselectedProduct = dressesPagelocator.productName.getText().trim();
						
			Assert.assertEquals(dressSelected, actualselectedProduct);
			
		}

}
