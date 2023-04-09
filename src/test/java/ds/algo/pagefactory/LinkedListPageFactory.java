package ds.algo.pagefactory;
		import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

		public class LinkedListPageFactory {
			
			WebDriver driver;
			
			
			//@FindBy(xpath="(//a[@class='align-self-end btn btn-lg btn-block btn-primary'])[3]")
			
			
			//@FindBy(linkText="Get Started")
			
			@FindBy(xpath="/html/body/div[3]/div[3]/div/div/a")
			WebElement llgetstarted;
			
			
			//@FindBy(xpath="(//li[@class='list-group-item list-group-item-light '])[1]")
			
			@FindBy(linkText="Introduction")
			//@FindBy(xpath="/html/body/div[2]/ul[1]/a")
			WebElement intro;
			
			@FindBy(linkText="Try here>>>")
			WebElement tryHereBtn;
			
			@FindBy(xpath="//form/div/div/div/textarea")
			WebElement textArea;
			
			@FindBy(xpath="//button[@type='button']")
			WebElement runBtn;
			
			
			@FindBy(linkText="Creating Linked LIst")
		    WebElement createlinkedlist;
			
			@FindBy(linkText="Types of Linked List")
			WebElement typlinklist;
			
			@FindBy(linkText="Implement Linked List in Python")
			WebElement linklistpython;
			
			@FindBy(linkText="Traversal")
			WebElement traversal;
			
			@FindBy(linkText="Insertion")
			
		    WebElement insertion;
			
			@FindBy(linkText="Deletion")
			WebElement deletion;
			
			@FindBy(id="output")
			WebElement runoutput;
			
			

		    public LinkedListPageFactory(WebDriver d) {

			this.driver = d;

			PageFactory.initElements(d, this);

		    }
			
			
			
			public void llGetstartedClick() {
				
				llgetstarted.click();
				
		}

			public void lIntroduction( ) {
				intro.click();
				 
				
			}
			
			public void tryHereBtnClick() {
				
				 tryHereBtn	.click();
			}
			
			public void textAreaEnterText() {
				
				textArea.sendKeys("print 'Hello'");
			}
			
			public void runBtnClick() {
				
				runBtn.click();
			}
			
			public void createLinkedList() {
				
				 createlinkedlist.click();
				 
			}
			
			public void typeLinkList() {
				
				typlinklist.click();
				 
			}
			
			public void linkListpython() {
				
				linklistpython.click();
				 
			}
			
			public void Traversal() {
				
				traversal.click();
				
			}
			
			public void Insertion() {
				
				insertion.click();
				 
			}
			
			public void Deletion() {
				
				deletion.click();
				 JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)","");
			}
			
			public void outputValidate() {
			Boolean out=runoutput.isDisplayed();
			
			if(out) {
				
				System.out.println("output is present");
			}
			else {
				System.out.println("output not present");
			}
			}
		}





