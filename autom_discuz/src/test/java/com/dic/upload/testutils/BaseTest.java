package com.dic.upload.testutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dic.testdata.ConfigReader;
import com.dic.webdriver.utils.WebDriverUtils;

public class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void  openBrowser(){
		driver = WebDriverUtils.getDriver(ConfigReader.getConfig(ConfigReader.BROWSER),this.getClass());
		String  wt = ConfigReader.getConfig(ConfigReader.WAITTIME);
		
		driver.manage().timeouts().implicitlyWait(Long.parseLong(wt), TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public  void  closeBrowser(){
		driver.quit();
		
	}
}
