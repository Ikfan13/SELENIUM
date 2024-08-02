package StepDefinition;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = " ",features = {"C:\\Users\\mohamedikfan.m\\Desktop\\SELENIUM\\CucumberProject\\src\\test\\resources\\Features"},glue = {"StepDefinition"},
plugin = {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	
	
	
}
