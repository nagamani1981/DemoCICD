package Academy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{

		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		LoginPage lp=l.getLogin(); //driver.findElement(By.css()
		lp.getUsername().sendKeys(Username);
		File logouser=lp.getUsername().getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(logouser, new File("logouser.png"));	
		lp.getPassword().sendKeys(Password);
		lp.getLoginbutton().click();
		log.info(text);
		
	
		//ForgotPassword fp= lp.forgotPassword();
		//fp.getEmail().sendKeys("xxx");
		//fp.sendMeInstructions().click();
		
		
		
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[0][2]="sample";
		//1st row
		data[1][0]="standard_user";
		data[1][1]="secret_sauce";
		data[1][2]="sample data2";
		
		return data;
		
		
		
		
		
		
	}
	
}
