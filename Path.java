package com.atmecs.Aspire.constant;

import java.io.File;

public class Path {
	public final static String USER_HOME=System.getProperty("user.dir") + File.separator;
	public final static String CHROME_FILE=USER_HOME + "lib" + File.separator + "chromedriver.exe";

}
