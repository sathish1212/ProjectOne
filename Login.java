package JenkiTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
//import org.openqa.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;

@Test public class Login {

	public static WebDriver g = new FirefoxDriver();
	

	public void accessurlsathish() throws Exception {
		
		g.get("http://angler83:81/TimeCheckV2.0/Index.aspx");
		g.manage().window().maximize();
		g.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		g.findElement(By.xpath("//*[@id='txt_UserName']")).sendKeys("admin");
		g.findElement(By.xpath("//*[@id='txt_Password']")).sendKeys("welcome");
		g.findElement(By.xpath("//*[@id='btn_Enter']")).click(); 
		Thread.sleep(1000); 
	
	}
	/*
	@Test(priority = 1)
	public void YearCreationn() 
	{
	g.findElement(By.id("194")).click();
	
	
	WebElement element = g.findElement (By.linkText("Year Setting"));
	element.click();
	element.click();
	g.findElement(By.xpath("//*[@id='ctl00_BodyContentPH_btn_Createyear']")).click();
	
	g.findElement(By.id("select2-ctl00_BodyContentPH_ddlStartMonth-container")).click();
	g.switchTo().activeElement().sendKeys("April");
	g.switchTo().activeElement().sendKeys(Keys.ENTER);
	
	g.findElement(By.id("select2-ctl00_BodyContentPH_ddlStartYear-container")).click();
	g.switchTo().activeElement().sendKeys("2016");
	g.switchTo().activeElement().sendKeys(Keys.ENTER);
	
	
	g.findElement(By.id("select2-ctl00_BodyContentPH_ddlEndMonth-container")).click();
	g.switchTo().activeElement().sendKeys("March");
	g.switchTo().activeElement().sendKeys(Keys.ENTER);
	
	
	g.findElement(By.id("select2-ctl00_BodyContentPH_ddlEndYear-container")).click();
	g.switchTo().activeElement().sendKeys("2017");
	g.switchTo().activeElement().sendKeys(Keys.ENTER);
	
	g.findElement(By.id("ctl00_BodyContentPH_btn_Add")).click();
	
	g.switchTo().alert();
	g.switchTo().alert().accept();
	g.switchTo().alert().accept();
	} 
	*/
}