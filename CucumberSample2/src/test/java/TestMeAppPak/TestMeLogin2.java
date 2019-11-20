package TestMeAppPak;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeLogin2 {
	WebDriver driver;
	
	

@Given("User opens the application")
public void user_opens_the_application() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 }

@When("User clicks on login link")
public void user_clicks_on_login_link() {
	
	 driver.findElement(By.xpath("//a[contains(text(),'											SignIn')]")).click();


}

@When("User enters {string} and {string}")
public void user_enters_and(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("userName")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);

}

@Then("Message displayed Login Successfully")
public void message_displayed_Login_Successfully() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	driver.findElement(By.xpath("//a[contains(text(),' SignOut')]")).click();
	Assert.assertTrue(true);
}


	
	
	
	
	

}
