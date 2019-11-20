package POMPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PomMethod2 {
  @Test
  public void f()
  {
	  	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Training_b6b.01.03\\\\Downloads\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageClass1 localElements = PageFactory.initElements(driver, PageClass1.class);
		localElements.LoginMethod("aravind.guggilla57@gmail.com", "aravind");
	  
  }
}
