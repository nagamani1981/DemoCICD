package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	/*By email=By.cssSelector("[id='user_email']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[value='Log In']");
	By forgotPassword = By.cssSelector("[href*='password/new']");*/
	
	By username=By.xpath("//input[@name='user-name']");
	By password=By.name("password");
	By login_button=By.id("login-button");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;

		
		
		
	}



/*public ForgotPassword forgotPassword()
{
	driver.findElement(forgotPassword).click();
	return new ForgotPassword(driver);
	
}*/
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLoginbutton()
	{
		
		return driver.findElement(login_button);
	}
	
	
	
}
