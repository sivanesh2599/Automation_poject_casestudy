package tatacliqproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tata_cliq {
	public static String url="https://www.tatacliq.com";
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		WebDriverManager.edgedriver().setup();	
		driver=new EdgeDriver();	
		driver.get(url);	
		driver.manage().window().maximize();	
		Thread.sleep(3000);
	}
	
	@Test(enabled=true,priority = 0)
	public void tc_01() throws InterruptedException 
		{
		test = extent.createTest("Checking the brands");	
		Actions actions = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
		actions.moveToElement(brands).build().perform();
		Thread.sleep(3000);
		test.pass("user is able to see various types of brands");
		Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 1)
	public void tc_02() throws InterruptedException 
		{	
		test = extent.createTest("Checking the footwear in brands");
		Actions actions = new Actions(driver);
		WebElement footwear = driver.findElement(By.xpath("*//div[contains(text(),'Footwear')]"));
		actions.moveToElement(footwear).build().perform();
		Thread.sleep(3000);
		test.pass("user able to see various brands of footwear");
		Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 2)
	public void tc_03() throws InterruptedException 
		{	
		test = extent.createTest("Checking the puma in footwear");
		Actions actions = new Actions(driver);
		WebElement puma = driver.findElement(By.xpath("*//div[contains(text(),'Puma')]"));
		puma.click();
		Thread.sleep(3000);
		test.pass("user able to click puma in footwear");
		Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 3)  
	public void tc_04() throws InterruptedException 
		{	
			test = extent.createTest("Checking the watches & Accessories");	
			Actions actions = new Actions(driver);
			WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
			actions.moveToElement(brands).build().perform();
			WebElement watch = driver.findElement(By.xpath("*//div[contains(text(),'Watches & Accessories')]"));
			actions.moveToElement(watch).build().perform();
			WebElement tommy = driver.findElement(By.xpath("*//div[contains(text(),'Tommy Hilfiger')]"));
			tommy.click();
			Thread.sleep(3000);
			test.pass("user able to see various products of Tommy Hilfiger");
			Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 4)  
	public void tc_05() throws InterruptedException 
		{	
			test = extent.createTest("Checking the watch brands in brands");
			Actions actions = new Actions(driver);
			WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
			actions.moveToElement(brands).build().perform();
			WebElement watch2 = driver.findElement(By.xpath("*//div[contains(text(),'Watches & Accessories')]"));
			actions.moveToElement(watch2).build().perform();
			Thread.sleep(3000);
			WebElement DW = driver.findElement(By.xpath("*//div[contains(text(),'Daniel Wellington')]"));
			DW.click();
			Thread.sleep(3000);
			test.pass("user able to click Daniel Wellington brands of watch");
			Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 5)  
	public void tc_06() throws InterruptedException 
		{	
			test = extent.createTest("Checking the kids brands in brands");
			Actions actions = new Actions(driver);
			WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
			actions.moveToElement(brands).build().perform();
			WebElement kids = driver.findElement(By.xpath("*//div[contains(text(),'Kids')]"));
			actions.moveToElement(kids).build().perform();
			Thread.sleep(3000);
			WebElement kid = driver.findElement(By.xpath("*//div[contains(text(),'A Little Fable')]"));
			kid.click();
			Thread.sleep(3000);
			test.pass("user able to click brands of kids");
			Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 6)  
	public void tc_07() throws InterruptedException 
		{	
			test = extent.createTest("Checking the cutecumber brands in brands");
			Actions actions = new Actions(driver);
			WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
			actions.moveToElement(brands).build().perform();
			WebElement kids = driver.findElement(By.xpath("*//div[contains(text(),'Kids')]"));
			actions.moveToElement(kids).build().perform();
			Thread.sleep(3000);
			WebElement kid1 = driver.findElement(By.xpath("*//div[contains(text(),'Cutecumber')]"));
			kid1.click();
			Thread.sleep(3000);
			test.pass("user able to click cutecumber of kids");
			Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 7)  
	public void tc_08() throws InterruptedException 
		{	
			test = extent.createTest("Checking the women in brands");
			Actions actions = new Actions(driver);
			WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
			actions.moveToElement(brands).build().perform();
			Thread.sleep(3000);
			WebElement women = driver.findElement(By.xpath("*//div[contains(text(),'Van Heusen')]"));
			women.click();
			Thread.sleep(3000);
			test.pass("user able to click women brands");
			Thread.sleep(3000);
		}
		
	@Test(enabled=true,priority = 8)  
	public void tc_09() throws InterruptedException 
		{
			test = extent.createTest("Checking the Categories");	
			Actions actions = new Actions(driver);
			WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Categories')]"));
			actions.moveToElement(brands).build().perform();
			Thread.sleep(3000);
			test.pass("user is able to see various types of categories");
			Thread.sleep(3000);
			WebElement home = driver.findElement(By.xpath("*//div[contains(text(),'Home & Kitchen')]"));
			actions.moveToElement(home).build().perform();
			Thread.sleep(3000);
			test.pass("user able to see Home & Kitchen in categories");
			Thread.sleep(3000);
		}

		
//		@Test(enabled=false,priority = 5)   
//		public void tc_7() throws InterruptedException 
//		{	
//		test = extent.createTest("Clicking the Home & Kitchen in categories");
//		Actions actions = new Actions(driver);
//		WebElement home = driver.findElement(By.xpath("*//div[contains(text(),'Home & Kitchen')]"));
//		actions.moveToElement(home).build().perform();
//		Thread.sleep(3000);
//		test.pass("user able to see Home & Kitchen in categories");
//		Thread.sleep(3000);
//		}
//		
//		@Test(enabled=false,priority = 6)
//		public void tc_8() throws InterruptedException 
//		{	
//		test = extent.createTest("Clicking the Beauty in categories");
//		Actions actions = new Actions(driver);
//		WebElement kids = driver.findElement(By.xpath("*//div[contains(text(),'Beauty')]"));
//		actions.moveToElement(kids).build().perform();
//		Thread.sleep(3000);
//		test.pass("user able to click various brands of Beauty");
//		Thread.sleep(3000);
//		}
//		
//		@Test(enabled=false,priority = 7)
//		public void tc_9() throws InterruptedException 
//		{	
//		test = extent.createTest("Clicking the Gadgets in categories");
//		Actions actions = new Actions(driver);
//		WebElement kids = driver.findElement(By.xpath("*//div[contains(text(),'Gadgets')]"));
//		actions.moveToElement(kids).build().perform();
//		Thread.sleep(3000);
//		test.pass("user able to click various brands of Gadgets");
//		Thread.sleep(3000);
//		}
//		
//		@Test(enabled=false,priority = 8)  
//		public void tc_10() throws InterruptedException 
//		{	
//		test = extent.createTest("Clicking the Jewellery in categories");
//		Actions actions = new Actions(driver);
//		WebElement kids = driver.findElement(By.xpath("*//div[contains(text(),'Jewellery')]"));
//		actions.moveToElement(kids).build().perform();
//		Thread.sleep(3000);
//		test.pass("user able to click various brands of Jewellery");
//		Thread.sleep(3000);
//		}
//		
//		@Test(enabled=false,priority = 0)
//		public void tc_11() throws InterruptedException 
//		{
//		test = extent.createTest("Checking the brands");	
//		Actions actions = new Actions(driver);
//		WebElement brands = driver.findElement(By.xpath("*//div[contains(text(),'Brands')]"));
//		actions.moveToElement(brands).build().perform();
//		Thread.sleep(3000);
//		test.pass("user is able to see various types of brands");
//		Thread.sleep(3000);
//		}
//
////		@Test(enabled=true,priority = 2)
////		public void tc_11() throws InterruptedException 
////		{	
////		test = extent.createTest("Checking the puma in footwear");
////		Actions actions = new Actions(driver);
////		WebElement footwear = driver.findElement(By.xpath("*//div[contains(text(),'Puma')]"));
////		footwear.click();
////		Thread.sleep(3000);
////		test.pass("user able to click puma in footwear");
////		Thread.sleep(3000);
////		}
//
//		@Test(enabled=false,priority = 1)
//		public void tc_12() throws InterruptedException 
//		{	
//		test = extent.createTest("Checking the footwear in brands");
//		Actions actions = new Actions(driver);
//		WebElement footwear = driver.findElement(By.xpath("*//div[contains(text(),'Footwear')]"));
//		actions.moveToElement(footwear).build().perform();
//		Thread.sleep(3000);
//		test.pass("user able to click various brands of footwear");
//		Thread.sleep(3000);
//		}

		@AfterTest(enabled=true)
		public void at()
		{
			driver.quit();
			extent.flush();
		}
		
	}

