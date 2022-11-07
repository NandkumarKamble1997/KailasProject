package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	@FindBy (xpath = "//input[@id='gender-male']") private WebElement genderMale;
	@FindBy (xpath = "//input[@id='gender-female']") private WebElement genderFemale;
	@FindBy (xpath = "//input[@id='FirstName']") private WebElement firstName;
	@FindBy (xpath = "//input[@id='LastName']") private WebElement lastName;
	@FindBy (xpath = "//select[@name='DateOfBirthDay']") private WebElement birthDate;
	@FindBy (xpath = "//select[@name='DateOfBirthMonth']") private WebElement birthMonth;
	@FindBy (xpath = "//select[@name='DateOfBirthYear']") private WebElement birthYear;
    @FindBy (xpath = "//input[@id='Email']") private WebElement email;
    @FindBy (xpath = "//input[@id='Company']") private WebElement companyName;
    @FindBy (xpath = "//input[@id='Newsletter']") private WebElement newsLetter;
    @FindBy (xpath = "//input[@id='Password']") private WebElement password;
    @FindBy (xpath = "//input[@id='ConfirmPassword']") private WebElement confirmPassword;
    @FindBy (xpath = "//button[@id='register-button']") private WebElement register;
    
    
    public RegisterPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void clickOnGenderMale() {
    	genderMale.click();
    }
    public void clickOnGenderFemale() {
    	genderFemale.click();
    }
    public void clickOnFirstName(String a) {
    	firstName.sendKeys(a);
    }
    
    public void clickOnLastName(String b) {
    	lastName.sendKeys(b);
    }
    public void  SelectBirthDate(int c) {
    	Select s =new Select(birthDate);
    	s.selectByIndex(c);
    }
    public void  SelectBirthMonth(String d) {
    	Select s =new Select(birthMonth);
    	s.selectByValue(d);
    }
    public void  SelectBirthYear(String e) {
    	Select s =new Select(birthYear);
    	s.selectByValue(e);
    }
    
    public void clickOnEmail(String f) {
    	email.sendKeys(f);
    }
    public void clickOnCompanyName(String g) {
    	companyName.sendKeys(g);
    }
    public void clickOnNewsLetter() {
    	newsLetter.click();
    }
    public void clickOnpassword(String h) {
    	password.sendKeys(h);
    }
    public void clickOnConfirmPassword(String i) {
    	confirmPassword.sendKeys(i);
    }
    public void clickOnRegister() {
    	register.click();
    }
    
}
