package ds.algo.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
WebDriver driver;

@FindBy(id="id_username")
WebElement user;

@FindBy(id="id_password")
WebElement pwd;

@FindBy(xpath="//input[@type='submit']")
WebElement login;

@FindBy(xpath="//div[@class='alert alert-primary']")
WebElement Success;



public LoginPageFactory(WebDriver d) {

	this.driver = d;

	PageFactory.initElements(d, this);
	

    }
public void enterUser(String uname) {
	user.sendKeys(uname);
}

public void enterPass(String pass) {
	pwd.sendKeys(pass);
}

public void loginClick() {
	login.click();
}

public void successmsg() {
	String loginmsg =Success.getText();
	System.out.println(loginmsg);
}

}
