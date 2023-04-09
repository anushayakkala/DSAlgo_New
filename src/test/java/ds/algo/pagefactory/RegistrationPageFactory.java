package ds.algo.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageFactory {
    
    WebDriver driver;

   
    
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerBtn;
    
    @FindBy(linkText="Login")
    WebElement logbtn;
    
    @FindBy(id = "id_username")
    WebElement usernameField;
    
    @FindBy(id = "id_password1")
    WebElement passwordField;
    
    @FindBy(id ="id_password2")
    WebElement confirmpswdField;
    
    @FindBy(linkText="Sign out")
    WebElement signout;
    
    @FindBy(linkText="Sign in")
    WebElement signin;
    
    public RegistrationPageFactory(WebDriver d) {
	this.driver = d;
	
	PageFactory.initElements(d, this);
    }
    
    
    public void registrationClick() {
	registerBtn.click();
	
    }
    
    public void LogClick() {
    	logbtn.click();
    }
    
    
    public void enterUserName(String username) {
	usernameField.sendKeys(username);
	
    }
    
    
    public void enterPassword(String password) {
	passwordField.sendKeys(password);
	
    }
    
    public void enterConfrmPasswd(String confirmPassword) {
	confirmpswdField.sendKeys(confirmPassword);
    }
    
    public void signOut() {
	signout.click();
}
    
    public void signIn() {
    	signin.click();
    }
}
