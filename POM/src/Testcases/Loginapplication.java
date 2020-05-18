package Testcases;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {
// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in Page object factory methdos
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		System.out.println("submit");
		rd.Home().click();
		
		RediffHomepage rh=new RediffHomepage(driver);
		
		Thread.sleep(3000);
		rh.Search().sendKeys("rediff");
		rh.Search().sendKeys(Keys.ENTER);
		//rh.Submit().click();
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
}
