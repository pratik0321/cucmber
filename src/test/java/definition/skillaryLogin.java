package definition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class skillaryLogin {
	WebDriver driver;
	String URL =  "https://demoapp.skillrary.com/";
	
	@Given("I should open the browser and navigate to the login page of skillary")
	public void i_should_open_the_browser_and_navigate_to_the_login_page_of_skillary() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);	
		driver.findElement(By.linkText("LOGIN")).click();
	}
	@When("Enter Username {string}")
	public void enter_username(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
	   
	}
	
	@When("Enter password {string}")
	public void enter_password(String pwd) {
		
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("last")).click();
	   
	}
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String name) {
		if (driver.getTitle().equalsIgnoreCase("SkillRary Courses"))
		{
		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		Assert.assertEquals(username, name);
	}
		else
			if(driver.getTitle().equalsIgnoreCase("SkillRary Ecommerce"))
			{
				String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
		  Assert.assertEquals(admin, name);
		  
	}
	}
	
		@Then("I should see the admin as {string}")
		public void i_should_see_the_admin_as(String string) {
			{ String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
			  Assert.assertEquals(admin, string);
		}
	}
	
		@Then("I should see the Registration page {string}")
		public void i_should_see_the_registration_page(String string) {
			 String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
			 Assert.assertEquals(Register, string);
		}
	}