package ds.algo.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import ds.algo.commmon.AlertHandle;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.GraphPageFactory;
import ds.algo.pagefactory.HomePageFactory;
import ds.algo.pagefactory.LinkedListPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPageStepDefinition {
	

	WebDriver driver=BrowserDriverManager.driverFactory();
GraphPageFactory gph= new GraphPageFactory(driver);


Logger logger = LogManager.getLogger();
	
	HomePageFactory hp = new HomePageFactory(driver) ;
	
	
	@Given("User Clicks on get started button of Graph Section")
	public void user_clicks_on_get_started_button_of_graph_section() {
	     
	System.out.println("This is above Graph");
		hp.clickGraphBtn();
		
		System.out.println("This is Graph");
	    
	}
	
	@Then("User navigates to Graph page")
	public void user_navigates_to_graph_page() {
		
	System.out.println("User navigates to Graph page");	
	
	}
	
	@Given("User clicks on Graph link")
	public void user_clicks_on_graph_link() {
	    
		gph.Graph();
		
	}
	
 @Given("User clicks on Graph Representations link")
	 
	 public void user_clicks_on_graph_representations_link() throws InterruptedException {
		 driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");;
		 gph.GraphRepresentation();
		 Thread.sleep(1000);
	 }
 
 @Then("User navigates to try editor page and enter invalid python code")
 
 public void user_navigates_to_try_editor_page_and_enter_invalid_python_code() {
	try {
	 gph.textAreaEnterText();
	}
	
	catch (Exception e) {
	 e.printStackTrace();
	}
 }
 
 @Then ("User  should handle the alert presented with Run result")
 
 public void user_should_handle_the_alert_presented_with_run_result() {
	
	 AlertHandle.alertHandle();
	 driver.navigate().refresh();
	 driver.navigate().back();
 }
 
	    @Then("User navigates to Graph Representations page")
	    public void user_navigates_to_graph_represenations_page() {
	    	
	    	logger.info("User is on Graph Representation page");
	    }
	    
	    @Then("User navigates to try editor page and enter  python code")
	    public void user_navigates_to_try_editor_page_and_enter_python_code() {
	       gph.textAreaEnterText();
	       System.out.println("User is on graph representation");
	       
	      // driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	    }
	    
	    @And("Browser is closed")
	    public void browser_is_closed() {
	    	
	    	driver.quit();
	    }
	   }
