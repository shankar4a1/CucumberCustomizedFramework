package com.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.supportlibrary.WebdriverUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDefinition {

	
	//final static Logger logger = Logger.getLogger(EggTimerTestRunner.class);

	//EggTimerPage egggTimerPage;
	 WebDriver driver ;
	@Before({"@component"})
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");

		WebdriverUtil webDriverUtil= new WebdriverUtil();
		driver = webDriverUtil.getDriver();
		driver.get("http://e.ggtimer.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }	
	
	@After({"@component"}
	)
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        driver.quit();
    }
}
