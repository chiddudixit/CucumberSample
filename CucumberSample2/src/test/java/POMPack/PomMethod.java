package POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomMethod {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Training_b6b.01.03\\\\Downloads\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		PageClass PObject=  new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		PObject.clicklink();
		String username=null;
		PObject.typeuname(username);
		String password=null;
		PObject.typepwd(password);
		PObject.loginlink();
		System.out.println("Title of the Page is: "+driver.getTitle());
	
	}

}
