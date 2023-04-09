package ds.algo.pagefactory;

import org.openqa.selenium.JavascriptExecutor;


		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.devtools.idealized.Javascript;
	import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		public class DataStructuresPageFactory {
			
			WebDriver driver;
			
			@FindBy(xpath="//a[@href='data-structures-introduction']")
			WebElement dsgetstart;
			
			
			@FindBy(xpath="//a[@href='time-complexity']")
			WebElement dstimecomplex;
			
			@FindBy(xpath="//a[@class='btn btn-info']")
			WebElement dstryhr;
			
			@FindBy(xpath="//form/div/div/div/textarea")
			WebElement dstextarea;
			
			@FindBy(xpath="//button[@type='button']")
			WebElement dsrun;
			
			 public DataStructuresPageFactory(WebDriver d) {

					this.driver = d;

					PageFactory.initElements(d, this);

				    }
			 
			  public void getStartedClick() {
				  dsgetstart.click();
				  
				  JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,250)","");
				    }
			  public void timeComplexity() {
				  
				  dstimecomplex.click();
				  JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,250)","");
			  }
			  
			  public void tryHere() {
				  
				  dstryhr.click();
			  }
			  
			  public void textArea() {
				  
				  dstextarea.sendKeys("print 'Hello World' ");
			  }
			  
			  public void rRun() {
				  dsrun.click();
				  
			  }
		}





