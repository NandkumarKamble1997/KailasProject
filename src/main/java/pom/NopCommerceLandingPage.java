package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceLandingPage {
	
	@FindBy (xpath = "//a[@class='ico-register']")private WebElement  Register;
	@FindBy (xpath = "//a[@class='ico-login']")private WebElement  LogIn;
	@FindBy (xpath = "//a[@class='ico-wishlist']")private WebElement  WishList;
	@FindBy (xpath = "//a[@class='ico-cart']")private WebElement  cart;
	@FindBy (xpath = "//input[@id='small-searchterms']")private WebElement  Search_Store;
	@FindBy (xpath = "//button[@type='submit']")private WebElement  Search;
	@FindBy (xpath = "(//a[@href='/computers'])[1]")private WebElement  Computers;
	@FindBy (xpath = "(//a[text() ='Electronics '])[1]")private WebElement  Electronics;
	@FindBy (xpath = "(//a[@href='/apparel'])[1]")private WebElement  Apparel;
	@FindBy (xpath = "(//a[@href='/digital-downloads'])[1]")private WebElement  Digital_Downloads;
	@FindBy (xpath = "(//a[@href='/books'])[1]")private WebElement Books;
	@FindBy (xpath = "(//a[text() = 'Gift Cards '])[1]")private WebElement  Gift_Cards;
    @FindBy (xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")private WebElement Logo;
    @FindBy (xpath = "//div [@class='currency-selector']")private WebElement currency;
	
	public NopCommerceLandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegister() {
		Register.click();
	}
	public void clickOnLogIn() {
		LogIn.click();
	}

	public void clickOnwishList() {
		WishList.click();
	}
	
	public void clickOnCart() {
		cart.click();
	}
	
	public void clickOnSearch_Store(String text) {
		Search_Store.sendKeys(text);
	}
	
	public void clickOnSearch() {
		Search.click();
	}
	
	public void clickOnComputers() {
		Computers.click();
	}
	public void clickOnApparel() {
		Apparel.click();
	}
	
	public void clickOnElectronics() {
		Electronics.click();
	}
	public void clickOnDigital_Downloads() {
		Digital_Downloads.click();
	}
	public void clickOnBooks() {
		Books.click();
	}
	public void clickOnGift_Cards() {
		Gift_Cards.click();
	}
	public void clickOnLogo() {
		Logo.click();
	}
	public void selectCurrency(int a) {
		Select s = new Select(currency);
		s.selectByIndex(a);
    }
}	
