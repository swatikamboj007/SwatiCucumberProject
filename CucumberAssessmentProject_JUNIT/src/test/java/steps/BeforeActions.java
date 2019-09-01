package steps;

//import org.junit.Before;

import cucumber.api.java.Before;
//import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public void setUp() {
		
		String browserName = getParameter("browser");
		SeleniumDriver.setUpDriver(browserName);
	}
	
	public String getParameter(String name) { 
		
		  String browserValue = System.getProperty(name);
		  if (browserValue == null)
		     throw new RuntimeException(name + " is not a parameter!");

		  if (browserValue.isEmpty())
		    throw new RuntimeException(name + " is empty!");

		  return browserValue;
		 }

}
