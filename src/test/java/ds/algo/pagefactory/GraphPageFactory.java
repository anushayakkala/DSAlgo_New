package ds.algo.pagefactory;



	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class GraphPageFactory {
		WebDriver driver;
		
		//@FindBy(linkText="Get Started")
	//	@FindBy(xpath="/html/body/div[2]/div[7]/div/div/a")
		 
	    @FindBy(xpath="//a[@href='graph']")
		WebElement graphgetstarted;
		
		
		
		@FindBy(linkText="Graph")
		WebElement graph;
		
		@FindBy(xpath="//a[@class='btn btn-info']")
		WebElement tryHereBtn;
		
		@FindBy(xpath="//form/div/div/div/textarea")
		WebElement  textArea;
		
		@FindBy(xpath="//button[@type='button']")
		WebElement runBtn;
		
		@FindBy(id="output")
		WebElement runOutput;
		
		@FindBy(linkText="Graph Representations")
		WebElement graphrepresentation;
		
		
		public GraphPageFactory(WebDriver d) {

			this.driver = d;

			PageFactory.initElements(d, this);

		    }
		
		public void GraphGetStarted() {
			
			graphgetstarted.click();
			
		}
		
		public void Graph() {
			
			graph.click();
		}
		public void tryHereBtnClick() {
			
			tryHereBtn.click();
		}

		
		public void textAreaEnterText() {
			
			textArea.sendKeys("Print Hello");
		}
		
		public void runBtnClick() {
			
	    	runBtn.click();
		}
		
		
	/*	public void GraphTextEditor1()
		
		{
			textArea.sendKeys("print hello");
		}*/
		public void GraphRun( ) {
			
			runBtn.click();
		}
		
		public void GraphRepresentation() {
			graphrepresentation.click();
		
		}
		
		 public void outputValidate() {
		    	Boolean out  = runOutput.isDisplayed();
		    	if(out) {
		    		System.out.println("output is present");
		    	}
		    	else {
		    		System.out.println("output is not present");
		    	}
		
	}

}