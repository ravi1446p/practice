package TestNGExamples;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_tesngB {
	@BeforeClass
	public void login() {
		System.out.println("Login complted");
	}
	@AfterClass
	public void logout() {
System.out.println("Logout completed");
}
	@Test(priority=1)
	public void addemp() {
		System.out.println("addemp completed");
	}
	@Test(priority=2)
	public void deleteemp() {
		System.out.println("deleteemp completed");
	}
}
