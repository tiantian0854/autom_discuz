package com.dic.testdata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private static  Properties prop;
	public  static  final String  BROWSER ="browser";
	public  static  final String  WAITTIME ="WAITTIME";

	
	static{
		prop= new Properties();
		InputStream is = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(ConfigReader.getConfig(ConfigReader.WAITTIME));
		//System.out.println(ConfigReader.getConfig(ConfigReader.BROWSER));
	}
	
	public  static String  getConfig(String name ){
		
		System.out.println(name);
		return prop.getProperty(name);
		
	}
	
}
