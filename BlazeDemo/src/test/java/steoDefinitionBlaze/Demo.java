

package steoDefinitionBlaze;

import org.openqa.selenium.By;
import java.util.Random;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;



public class Demo {

 WebDriver driver = null;
 WebDriverWait wait;
 

 @Given("browser is open and on Blaze demo website")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "/Users/amitbarua/Downloads/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://blazedemo.com");
 
 }



 

 @And("User waits {int} seconds to see")
	public static void user_wait_see(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
 
 
 @And("User chooses {string}, {string} and {string}")
 public void user_chooses(String departCity, String destCity, String flight, DataTable cities) {
	
	 List<List<String>> example = cities.asLists(String.class);
     Random random = new Random();
     int randomIndex = random.nextInt(example.size());
     departCity = example.get(randomIndex).get(0);
     destCity   = example.get(randomIndex).get(1);
     flight     = example.get(randomIndex).get(2);
     
     
    String optionSelector1 = String.format("[value='%s']", departCity);
	String optionSelector2 = String.format("[value='%s']", destCity);
	String optionSelector3 = String.format("[value='%s']", flight);

	
	
	
	WebElement cityOption1 = driver.findElement(By.cssSelector(optionSelector1));
	driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).click();
	cityOption1.click();
	
	WebElement cityOption2 = driver.findElement(By.cssSelector(optionSelector2));
	driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")).click();
	cityOption2.click();
	
	driver.findElement(By.cssSelector("[value='Find Flights']")).click();
	
	
	wait = new WebDriverWait(driver, 10);
	WebElement flightNumber = driver.findElement(By.cssSelector(optionSelector3));
    WebElement button = flightNumber.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input"));
    button.click();

	
    
 }
 
 
 @And("User waits {int} seconds")
	public static void user_wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
    
	}
 
  
  
  
  
  @And("User enters {string} into {string} field")
  public void userEntersValueIntoInput(String valueToEnter, String fieldName) {
	  WebElement inputElement = driver.findElement(By.id(fieldName));
	  inputElement.sendKeys(valueToEnter);
  }
 

  @And("User waits {int} seconds to review")
	public static void user_wait_again2(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

  
  @And("User click the {string} button")
 public void user_click_button(String buttonText) {
      WebElement button = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
      button.click();
  }
  
  
  @And("User waits {int} seconds to confirm")
	public static void user_wait_again3(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
 
  @Then("Browser closes")
  public void browser_closes(){
	  driver.close();	
	  
	 }
  
  



 
 
}
