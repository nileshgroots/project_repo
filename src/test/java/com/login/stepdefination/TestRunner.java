package com.login.stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature/login_logout.feature",
glue= {"com.login.stepdefination"},
monochrome=true)
 
		
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
