package com.login.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageMethods.driverInitiate;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	//WebDriver driver;
	driverInitiate obj = new driverInitiate();
	
	@Before
	public void setup() {
		
		obj.launchbrowser();
	}
	

	 @After
	public void quiteBrowser() {
	obj.teardown();
	 }

}