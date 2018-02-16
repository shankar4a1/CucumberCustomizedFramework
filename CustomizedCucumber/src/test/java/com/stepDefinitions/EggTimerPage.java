package com.stepDefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EggTimerPage{


	

@Given("^user is on Home page$")
public void user_is_on_Home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	
	
	System.out.println("first");
	
}

@When("^he enters \"([^\"]*)\"$")
public void he_enters(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	System.out.println("first");
}

@When("^clicks on Go button$")
public void clicks_on_Go_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("first");
}

@Then("^EggTimer count down should start$")
public void eggtimer_count_down_should_start() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	System.out.println("first");
}

}
