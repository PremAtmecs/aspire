package com.atmecs.Aspire.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	File file=new File("C:\\Users\\premkumar.sarathi\\eclipse-workspace\\Aspire\\src\\main\\resources\\suites\\config.properties");
	FileInputStream inputstream=null;
	Properties property=null;
	public ConfigReader() {
		try {
			inputstream=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(inputstream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getUrl() {
		return property.getProperty("url");
	}
	public String getUserpath() {
		return property.getProperty("Employeepath");
	}
	public String getUsername() {
		return property.getProperty("Employeename");
	}
	public String getPasswordpath() {
		return property.getProperty("passwordPath");
	}
	public String getPasswordname() {
		return property.getProperty("Password");
	}
	public String getLoginbtn() {
		return property.getProperty("Loginbtnpath");
	}

}
