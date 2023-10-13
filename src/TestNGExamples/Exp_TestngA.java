package TestNGExamples;
import org.testng.annotations.Test;
public class Exp_TestngA {
	@Test  //one @Test is equal to ane Test case / One Scenario on Html report
	public void login() {
		System.out.println("login completed");
	}
    @Test
    public void logout() {
    	System.out.println("logout completed");
		}
    @Test
    public void addemp() {
    	System.out.println("addemp completed");
	}
    @Test
    public void deletemp() {
    	System.out.println("deletemp completed");
    }


}
