package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import com.hrms.utility.Log;

public class General extends Global {
    // To provide all reuseable fun realated to whole application 
	public void openapplication() {
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("application opened");
		Log.info("login completed");

		
	}
	public void closeapplication() {
		driver.close();
		System.out.println("appication closed");
		Log.info("Applicatuon closed");

	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login comopleted");
		Log.info("login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	public void enterframe() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter into frame");
		Log.info("Enter into frame");

	}
	public void Exitframe() {
		driver.switchTo().defaultContent();
		System.out.println("Exit into Frame");
		Log.info("Exit into frame");

	}
	public void addnewemp() {
		driver.findElement(By.xpath(btn_Addd)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Emp Added");
		Log.info("New Emp Added");

		
	}
}
