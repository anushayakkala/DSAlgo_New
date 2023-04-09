package ds.algo.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

    WebDriver driver;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement getStartedBtn;
    
    
    @FindBy(xpath="//a[@href='array']")
    WebElement arrayBtn;
    
    @FindBy(xpath="//a[@href='linked-list']")
    WebElement linkedListBtn;
    
    @FindBy(xpath="//a[@href='tree']")
    WebElement treeBtn;
    
    @FindBy(xpath="//a[@href='graph']")
    WebElement graphBtn;
    
    @FindBy(xpath="//div[@id='navbarCollapse']/div[2]/ul/a[2]")
    WebElement registerBtn;
   
    
    public HomePageFactory(WebDriver d) {

	this.driver = d;

	PageFactory.initElements(d, this);

    }

    public void clickStartButton() {

	getStartedBtn.click();

    }

    
    public void clickArrayBtn() {

	arrayBtn.click();
    }
    
    
    
    public void clickLinkedListBtn() {

	linkedListBtn.click();
    }
    
    
    public void clickTreeBtn() {

	treeBtn.click();
    }
    
    
    public void clickGraphBtn() {

    	
     JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	graphBtn.click();
    }
    
    
    public void clickRegisterBtn() {
	registerBtn.click();
	
    }  
    
}
