package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy (xpath = "//input[@id='Email']")private WebElement email ;
	@FindBy (xpath = "//input[@id='Password']")private WebElement password ;
	@FindBy (xpath = "//input[@id='RememberMe']")private WebElement rememberMe ;
	@FindBy (xpath = "//a[@href='/passwordrecovery']")private WebElement forgot ;
	@FindBy (xpath = "(//button[@type='submit'])[1]")private WebElement logIn ;

	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEmail (String a) {
		email.sendKeys(a);
	}
    public void  clickOnpassword (String b) {
		password.sendKeys(b);
	}
    public void  clickOnRememberMe() {
	rememberMe.click();
    }
    public void  clickOnForgot () {
	forgot.click();
    }
    public void   clickOnLogIn() {
		logIn.click();
	}
}
