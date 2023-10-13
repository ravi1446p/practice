package TestNGExamples;

import org.testng.annotations.Test;

public class Exp_Testng {
	@Test // one @Test is equal to one TC / Scenario in Htmlreport
	public void login() {
	System.out.println("Login completed");
	}
	@Test
	public void logout() {
	System.out.println("Logout completed");
	}
}

