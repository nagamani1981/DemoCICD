package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	
	public WebDriver driver;
	
	/*By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");*/
	
	 By first_item=By.id("add-to-cart-sauce-labs-backpack");
	 By second_item=By.id("add-to-cart-sauce-labs-bike-light");
	 By cart_button=By.xpath("//a[@class='shopping_cart_link']");
	 By checkout_button=By.id("checkout");
	 By continue_button=By.id("continue");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public LoginPage getLogin()
	{
		// driver.findElement(signin).click();
		 LoginPage lp=new LoginPage(driver);
		 
		 return lp; 
		 
	}
	public WebElement getFirstitem()
	{
		
		return driver.findElement(first_item);
	}
	public WebElement getSeconditem()
	{
		
		return driver.findElement(second_item);
	}
	public WebElement getCartbutton()
	{
		
		return driver.findElement(cart_button);
	}
	public WebElement getCheckoutbutton()
	{
		
		return driver.findElement(checkout_button);
	}
	public WebElement getContinuebutton()
	{
		
		return driver.findElement(continue_button);
	}
	
	
}
