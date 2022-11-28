package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition_1 {
	public static String url="https://www.tatacliq.com";
	WebDriver driver;

	@Given("user should go to the home page of Tatacliq")
	public void user_should_go_to_the_home_page_of_tatacliq() throws InterruptedException {
		WebDriverManager.edgedriver().setup();	
		driver=new EdgeDriver();	
		driver.get(url);	
		driver.manage().window().maximize();	
		Thread.sleep(3000);
	   
	    
	}
	@When("user place curzor on the acessories in categories")
	public void user_place_curzor_on_the_acessories_in_categories() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement categories = driver.findElement(By.xpath("*//div[contains(text(),'Categories')]"));
		actions.moveToElement(categories).build().perform();
		Thread.sleep(3000);
		WebElement accessories = driver.findElement(By.xpath("*//div[contains(text(),'Accessories')]"));
		actions.moveToElement(accessories).build().perform();
		Thread.sleep(3000);
	}
	@Then("user able to see the multiple fields in the accessories")
	public void user_able_to_see_the_multiple_fields_in_the_accessories() {
			driver.quit();
	}



}
