package webdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC001_Chromeb {
	public static void main (String args[])throws Exception {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(4000);
		System.out.println("appliction open");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("login completed");
		driver.findElement(By.linkText( "Logout")).click();
		System.out.println("logout completed");
		Thread.sleep(4000);
		driver.close();
	}
			

}



