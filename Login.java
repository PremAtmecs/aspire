package com.atmecs.Aspire.testSuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.atmecs.Aspire.helper.Loginpage;

public class Login {
	Loginpage page=new Loginpage();
	
	@Test
	public void login() throws IOException, InterruptedException {
		
		page.browser();
		page.openbrowser();;
		page.employee_login();
		page.clickTimesheet();
		page.Monday();
		page.Tuesday();
		page.Wednesday();
		page.Thursday();
		page.Friday();
		page.Savebtn();
		Thread.sleep(5000);
		page.Approvalbtn();
		
		
	}

}


