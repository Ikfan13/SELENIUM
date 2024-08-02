package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PackageFactoryTest.HomePageFactory;
import PackageFactoryTest.LoginPageFactory;
import io.cucumber.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PageFactoryLoginSteps {

	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    login = new LoginPageFactory(driver);
	    login.enterUsername(username);
	    login.enterPassword(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    login.clickLoginButton();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   home=new HomePageFactory(driver);
	   home.cartIconIsDisplayed();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}



}
