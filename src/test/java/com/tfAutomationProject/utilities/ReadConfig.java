package com.tfAutomationProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {


	Properties prop;

	public ReadConfig ()

	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) 
		{

			System.out.println("Exception is " + e.getMessage());
		}




	}


	public String getHomeURL()
	{
		String homeurl=prop.getProperty("baseURL");
		return homeurl;
	}
	public String chromepath()

	{
		String cpath =prop.getProperty("chromepath");
		return cpath;

	}



}


