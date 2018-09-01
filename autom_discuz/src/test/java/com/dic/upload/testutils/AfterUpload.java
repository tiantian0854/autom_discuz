package com.dic.upload.testutils;

import org.testng.annotations.AfterSuite;

import com.dic.webdriver.utils.WebDriverUtils;

public class AfterUpload {
	@AfterSuite
	public void  stopService(){
		WebDriverUtils.stopService();
	}
}
