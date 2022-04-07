package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class testlogin {
	
	WebDriver driver;
	public String URL = "https://opensource-demo.orangehrmlive.com";
	

	@Given("I should be in the login page of OrangeHRM")
	public void i_should_be_in_the_login_page_of_orange_hrm() {
		 WebDriverManager.chromedriver().setup();	
		 driver = new ChromeDriver();
		 driver.get(URL);
	}
	
	@When("Enter name")
	public void enter_name() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   
	}

	@When("Enter password")
	public void enter_password() {
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("login succesfull")
	public void login_succesfull() {
	    
		Assert.assertEquals(driver.getTitle(),"OrangeHRM";
	}
	
	
}
