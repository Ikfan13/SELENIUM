package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"C:\\Users\\mohamedikfan.m\\Desktop\\SELENIUM\\POMTESTProject\\src\\test\\resources\\Features"},
glue= {"StepDefinition"},
plugin= {"pretty","html:target/HtmlReport.html"}
)
public class POMTestrunner extends AbstractTestNGCucumberTests {


}
