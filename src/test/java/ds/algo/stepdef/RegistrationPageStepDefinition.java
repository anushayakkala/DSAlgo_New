package ds.algo.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.RegistrationPageFactory;
import io.cucumber.java.en.*;

public class RegistrationPageStepDefinition {

    WebDriver driver = BrowserDriverManager.driverFactory();

    RegistrationPageFactory registerPageFactory = new RegistrationPageFactory(driver);

    Logger logger = LogManager.getLogger();

    @Given("User clicks on Register button")
    public void user_clicks_on_register_button() throws InterruptedException {
	registerPageFactory.registrationClick();
	Thread.sleep(1000);
    }

    @Then("Error message for empty field is displayed")
    public void error_message_for_empty_field_is_displayed() throws InterruptedException {
	logger.error("Please fill out this field");
	Thread.sleep(1000);
    }
    @Given("User clicks on the login link")
    public void user_clicks_on_the_login_link() throws InterruptedException {
        registerPageFactory.LogClick();
        driver.navigate().to("https://dsportalapp.herokuapp.com/register");
        Thread.sleep(1000);
        
    }

    @Then("login page should be displayed")
    public void login_page_should_be_displayed() throws InterruptedException {
    	logger.info("User is on login page");
    	Thread.sleep(1000);
    }


    @Given("User enters {string} and {string} and {string}")
    public void user_enters_username_and_password_and_confirmpassword(String username, String password, String confirmationPassword) throws InterruptedException {
	registerPageFactory.enterUserName(username);
	registerPageFactory.enterPassword(password);
	registerPageFactory.enterConfrmPasswd(confirmationPassword);
	Thread.sleep(1000);
    }

    @Then("user is able to register sucessfully")
    public void user_is_able_to_register_sucessfully() throws InterruptedException {
	String actualURL = driver.getCurrentUrl();
	//String expectedURL = "https://dsportalapp.herokuapp.com";
	String expectedURL = "https://dsportalapp.herokuapp.com/home";
	Assert.assertEquals(actualURL, expectedURL);
	logger.info("User registered successfully");
	Thread.sleep(1000);
    }
    
    @Given("User click on Sign out link")
    public void user_click_on_sign_out_link() {
    	registerPageFactory.signOut();
    }

    @Then("Sign out done successfully")
    public void sign_out_done_successfully() {
       logger.info("Logged out successfully");
    }

    @And("Click on Signin link")
    public void click_on_signin_link() {
    	registerPageFactory.signIn();
    }

}
