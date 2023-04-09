package ds.algo.stepdef;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ds.algo.commmon.AlertHandle;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.HomePageFactory;
//import ds.algo.pagefactory.DataStructuresPageFactory;
import ds.algo.pagefactory.LinkedListPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListPageStepDefinition {
	
	WebDriver driver=BrowserDriverManager.driverFactory();
	LinkedListPageFactory lt= new LinkedListPageFactory(driver);
	
	Logger logger = LogManager.getLogger();
	
	HomePageFactory hp = new HomePageFactory(driver) ;

	
	
	@Given("User Clicks on getstarted button of Linked List")
	public void user_clicks_on_getstarted_button_of_linked_list() {
		
		hp.clickLinkedListBtn();
	   //llist.llGetstartedClick();
	   
	   
	}
	
	@Then("User navigates to linked list page")
	public void user_navigates_to_linked_list_page() {
		String actualURL=driver.findElement(By.xpath("//h4[@class='bg-secondary text-white']")).getText();
		String ExpectedURL ="Linked List";
		Assert.assertEquals(actualURL, ExpectedURL);
		logger.info("Linked List  page is displayed succesfully");
		
	}

	
	@Given("User clicks on Introduction link")
	public void user_clicks_on_introduction_link() {
	   lt.lIntroduction();
	}

	@Then("User navigates to introduction page")
	public void user_navigates_to_introduction_page() {
	   logger.info("User is on introduction page");
	}

	@And("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
	   lt.tryHereBtnClick();
	}

	@Then("User navigates to try editor page and enter python code")
	public void user_navigates_to_try_editor_page_and_enter_python_code() {
	   lt.textAreaEnterText();
	}

	@And("User click on Run button")
	public void user_click_on_run_button() {
	 lt.runBtnClick();
	}

	@Given("User is on text editor page of introduction")
	public void user_is_on_text_editor_page_of_introduction() {
	    logger.info("User is on text editor page");
	}

	@Then("User should be navigated to Linked list page and click on Creating Linked List")
	public void user_should_be_navigated_to_linked_list_page_and_click_on_creating_linked_list() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	   lt.createLinkedList();
	}

	@Given("User is on text editor page of Create Linked list")
	public void user_is_on_text_editor_page_of_create_linked_list() {
		 logger.info("User is on text editor page");
	}
	
	
	@Then("User should be navigated to Linked List page and click on Types of Linked List")
	public void user_should_be_navigated_to_linked_list_page_and_click_on_types_of_linked_list() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	   lt.typeLinkList(); 
	}

	@Given("User is on text editor page of Types of linked List")
	public void user_is_on_text_editor_page_of_types_of_linked_list() {
		 logger.info("User is on text editor page");
	}

	@Then("User should be navigated to Implement Linked List in python")
	public void user_should_be_navigated_to_implement_linked_list_in_python() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	   lt.linkListpython();
	}

	@Given("User is on text editor page of Implement Linked List")
	public void user_is_on_text_editor_page_of_implement_linked_list() {
		 logger.info("User is on text editor page");
	}

	@Then("User should be navigated to Traversal")
	public void user_should_be_navigated_to_traversal() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	    lt.Traversal();
	}

	@Given("User is on text editor of Traversal")
	public void user_is_on_text_editor_of_traversal() {
		 logger.info("User is on text editor page");
	}

	@Then("User should be navigated to Insertion")
	public void user_should_be_navigated_to_insertion() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	  lt.Insertion(); 
	}

	@Then("user should be navigated to Deletion")
	public void user_should_be_navigated_to_deletion() throws InterruptedException {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	 lt.Deletion();
	 Thread.sleep(2000);
	 
	 driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}

}	
	
	 
	 
	
	


	

