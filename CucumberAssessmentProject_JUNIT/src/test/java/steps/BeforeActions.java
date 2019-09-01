package steps;

//import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	
	@cucumber.api.java.Before
	public static void setUp() {
		
		SeleniumDriver.setUpDriver();
	}

}
