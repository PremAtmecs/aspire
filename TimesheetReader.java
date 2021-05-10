package com.atmecs.Aspire.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TimesheetReader {
	File file=new File("C:\\Users\\premkumar.sarathi\\eclipse-workspace\\Aspire\\src\\main\\resources\\suites\\Timesheet.properties");
	FileInputStream inputstream=null;
	Properties property=null;
	public TimesheetReader() throws IOException {
		inputstream=new FileInputStream(file);
		property=new Properties();
		property.load(inputstream);
	}
		public String Timesheet() {
			return property.getProperty("TimeSheetpath");
		}
		public String Monday() {
			return property.getProperty("Monday");
		}
		public String Mondayhour(){
			return property.getProperty("Monday-hours");
		}
		public String Tuesday() {
			return property.getProperty("Tuesday");
		}
		public String Tuesdayhour(){
			return property.getProperty("Tuesday-hours");
		}
		public String Wednesday() {
			return property.getProperty("Wednesday");
		}
		public String Wednesdayhour(){
			return property.getProperty("Wednesday-hours");
		}
		public String Thursday() {
			return property.getProperty("Thursday");
		}
		public String Thursdayhour(){
			return property.getProperty("Thursday-hours");
		}
		public String Friday() {
			return property.getProperty("Friday");
		}
		public String Fridayhour(){
			return property.getProperty("Friday-hours");
		}
		public String Savebtn(){
			return property.getProperty("save");
		}
		public String Okbtn(){
			return property.getProperty("ok");
		}
		public String Approvalbtn(){
			return property.getProperty("Approval");
		}
		
	}


