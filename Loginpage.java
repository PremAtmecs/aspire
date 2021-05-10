package com.atmecs.Aspire.helper;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.atmecs.Aspire.constant.Path;
import com.atmecs.Aspire.utils.ConfigReader;
import com.atmecs.Aspire.utils.TimesheetReader;

public   class Loginpage {
	 ConfigReader Read;
	 TimesheetReader module;
	 public static WebDriver driver=null;
	
	    public void browser(){
	        	Read=new ConfigReader();
	    		System.setProperty("webdriver.chrome.driver",Path.CHROME_FILE);
	    	driver=new ChromeDriver(); 
//	        return driver;
	        }
	public void openbrowser() {
		String path=Read.getUrl();
		
		driver.get(path);
		driver.manage().window().maximize();
	}
	public void employee_login() {
		String namepath=Read.getUserpath();
		String name=Read.getUsername();
		String passwordpath=Read.getPasswordpath();
		String passwordname=Read.getPasswordname();
		String loginbtn=Read.getLoginbtn();
		WebElement user=driver.findElement(By.xpath(namepath));
		user.sendKeys(name);
		WebElement password=driver.findElement(By.xpath(passwordpath));
		password.sendKeys(passwordname);
		WebElement loginbt=driver.findElement(By.xpath(loginbtn));
		loginbt.click();
	}
	public void clickTimesheet() {
		try {
			module=new TimesheetReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String timesheet=module.Timesheet();
		System.out.println(timesheet);
		WebElement ts=driver.findElement(By.xpath(timesheet));
		ts.click();
	}
	public void Monday() throws IOException {
		module=new TimesheetReader();
		String monday=module.Monday();
		String day1=module.Mondayhour();
		WebElement md=driver.findElement(By.xpath(monday));
		md.click();
		md.sendKeys(day1);
	}
	public void Tuesday() throws IOException {
		module=new TimesheetReader();
		String tuesday=module.Tuesday();
		String day2=module.Tuesdayhour();
		WebElement md=driver.findElement(By.xpath(tuesday));
		md.click();
		md.sendKeys(day2);
	}
	public void Wednesday() throws IOException {
		module=new TimesheetReader();
		String wednesday=module.Wednesday();
		String day3=module.Wednesdayhour();
		WebElement md=driver.findElement(By.xpath(wednesday));
		md.click();
		md.sendKeys(day3);
	}
	public void Thursday() throws IOException {
		module=new TimesheetReader();
		String thursday=module.Thursday();
		String day4=module.Thursdayhour();
		WebElement md=driver.findElement(By.xpath(thursday));
		md.click();
		md.sendKeys(day4);
	}
	public void Friday() throws IOException {
		module=new TimesheetReader();
		String friday=module.Friday();
		String day5=module.Fridayhour();
		WebElement md=driver.findElement(By.xpath(friday));
		md.click();
		md.sendKeys(day5);
	}
	public void Savebtn() throws IOException, InterruptedException {
		module=new TimesheetReader();
		String save=module.Savebtn();
		driver.findElement(By.xpath(save)).click();
		Thread.sleep(7000);
		String okbtn=module.Okbtn();
		driver.findElement(By.xpath(okbtn)).click();
		
	}
	public void Approvalbtn() throws IOException, InterruptedException {
		module=new TimesheetReader();
		String approval=module.Approvalbtn();
		WebElement md=driver.findElement(By.xpath(approval));
		md.click();
		Thread.sleep(7000);
		String okbtn=module.Okbtn();
		driver.findElement(By.xpath(okbtn)).click();
	}
	
	
	
}
