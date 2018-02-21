package com.stepDefinitions;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.EggTimerPage;
import com.supportlibrary.GenericFunctions;
import com.supportlibrary.WebdriverUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepImplementations extends GenericFunctions {

	 WebDriver driver ;
	 EggTimerPage egggTimerPage;
	 
	 final static Logger logger = Logger.getLogger(StepImplementations.class);

		

		@FindBy(how = How.NAME, using = "start_a_timer")
		private WebElement SearchTextBox;


		@FindBy(how = How.ID, using = "timergo")
		private WebElement GoButton;


		@FindBy(how = How.ID, using = "progressText")
		private WebElement ProgressText;

		


		@Before({"@component"})
	    public void beforeScenario(){
	        System.out.println("This will run before the Scenario");

			WebdriverUtil webDriverUtil= new WebdriverUtil();
			driver = webDriverUtil.getDriver();
			driver.get("http://e.ggtimer.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			egggTimerPage=new EggTimerPage(driver);
			
			
	    }	
		
		@After({"@component"}
		)
	    public void afterScenario(){
	        System.out.println("This will run after the Scenario");
	        driver.quit();
	    }
	
		
@Given("^user is on Home page$")
public void user_is_on_Home_page() throws Throwable {
	
	
	egggTimerPage.verifyHomePge();
	
	
	
	
}



@When("^he enters \"([^\"]*)\"$")
public void he_enters(String text) throws Throwable {
	
	egggTimerPage.enterData(text);
	
  
}

@When("^clicks on Go button$")
public void clicks_on_Go_button() throws Throwable {
	egggTimerPage.click_on_Go();
    
}

@Then("^EggTimer count down should start for \"([^\"]*)\"$")
public void eggtimer_count_down_should_start_for(String text) throws Throwable {
	 egggTimerPage.verifyTimer(text);
}

  


}

