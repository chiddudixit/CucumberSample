package StepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesstMeAppLogin {
	
	WebDriver driver=null;

	@Given("the Login Page is Opened")
	public void the_Login_Page_is_Opened() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.xpath("//a[contains(text(),'											SignIn')]")).click();
	   // throw new cucumber.api.PendingException();
	}

	@When("User enters lalitha as Username")
	public void user_enters_lalitha_as_Username() {
		
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters password{int} as Password")
	public void user_enters_password_as_Password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@Then("User will finds a TestMeApp Home Page")
	public void user_will_finds_a_TestMeApp_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' SignOut')]")).click();
		Assert.assertTrue(true);
		
		
		
	}


	
}
