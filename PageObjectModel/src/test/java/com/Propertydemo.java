package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertydemo {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("D:\\workspace\\Java\\Selenium_sima\\PageObjectModel\\src\\test\\resources\\data.properties");
			Properties prop = new Properties();
			
			prop.load(fis);
			
			String name = prop.getProperty("name");
			System.out.println(name);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
