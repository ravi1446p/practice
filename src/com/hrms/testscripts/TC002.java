package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC002 {
	@Test
	public void TC001() {
		DOMConfigurator.configure("log4j.xml");

	//public static void main(String args[]) {
		      //Test Steps
		General obj = new General();
		obj.openapplication();
		obj.login();
		obj.enterframe();
		obj.addnewemp();
		obj.Exitframe();
		obj.logout();
		obj.closeapplication();
	}

}
