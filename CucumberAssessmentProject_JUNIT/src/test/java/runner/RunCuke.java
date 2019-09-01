package runner;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		features= {"src/test/resources/features"},
		glue= {"steps"},
		monochrome=true,
		tags= {"@User-Register","@Megamenu","@Summer-Dresses","@Cart-Validation","@User-Register-InvalidEmail","@User-Register-ValidEmail"},
		plugin = {"pretty","html:target/RunCuke/cucumber.html","html:test-output/Cucumber-report"})

public class RunCuke {

//	@BeforeClass
//	public static void extentReportMth() {
//
//		Date date = new Date();
//		String dateString = date.toString().replace(":", "_").replace(" ", "_");
//		String ExtentReport = "./ExtentReports/ExtentReport" + "-" + dateString;
//
//		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//		extentProperties.setReportPath(ExtentReport + ".html");
	//}
	
}
