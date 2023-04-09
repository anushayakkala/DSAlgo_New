package ds.algo.stepdef;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.commmon.ConfigFileReader;
import ds.algo.pagefactory.HomePageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
    WebDriver driver = BrowserDriverManager.driverFactory();
    HomePageFactory homePageFactory = new HomePageFactory(driver);
    
    Logger logger = LogManager.getLogger();

    @Given("User launch the dsAlgo website")
    public void user_launch_the_ds_algo_website() throws IOException {
	driver.get(ConfigFileReader.launchWebsite("dsAlgoURL"));
	
    }

    @When("User clicks Get Started button on launch page")
    public void User_clicks_Get_Started_button_on_launch_page() {
	homePageFactory.clickStartButton();
	System.out.println("Launchpage opened successfully");
	
    }
   
//    @Then("User clicks on Register link")
//    public void user_clicks_on_register_link() {
//	
//    driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();
//    
//    driver.navigate().refresh();
    
//    driver.findElement(By.xpath("//a[@href='stack']")).click();
//    driver.navigate().refresh();
//    
//    driver.findElement(By.xpath("//a[@href='queue']")).click();
//    driver.navigate().refresh();
//    
//    driver.findElement(By.xpath("//a[@href='tree']")).click();
//    driver.navigate().refresh();
//    
//    driver.findElement(By.xpath("//a[@href='graph']")).click();
//    driver.navigate().refresh();}
   
    
    @When("User clicks Get Started on Array section")
    public void user_clicks_get_started_on_array_section() {
	homePageFactory.clickArrayBtn();
	 driver.navigate().refresh();
    }

    @Then("Error message is displayed")
    public void error_message_is_displayed() {
	logger.error("You are not logged in");
    }

    @Given("User clicks Get Started button on Linked List section")
    public void user_clicks_get_started_button_on_linked_list_section(){
	 homePageFactory.clickLinkedListBtn();
	 driver.navigate().refresh();
    }

    @Given("User clicks Get Started button on Tree section")
    public void user_clicks_get_started_button_on_tree_section() {
	 homePageFactory.clickTreeBtn();
	    driver.navigate().refresh();
    }

    @Given("User clicks Get Started button on Graph section")
    public void user_clicks_get_started_button_on_graph_section() {
	  homePageFactory.clickGraphBtn();
	    driver.navigate().refresh();
 
    }
    
    @Given("User clicks on the Register link")
    public void user_clicks_on_the_register_link() {
	homePageFactory.clickRegisterBtn();
    }

    @Then("Registration page is displayed")
    public void registration_page_is_displayed() {
    logger.info("Registration page displayed successfully");
	
    }
    
   
    }


