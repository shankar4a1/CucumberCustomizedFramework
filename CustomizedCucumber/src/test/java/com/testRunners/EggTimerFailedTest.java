package com.testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/rerun.txt",
		glue= {"com.stepDefinitions"},
		monochrome = true,
			
		plugin = {"pretty","html:Cucumberhtml",
                "json:Cucumberjson/cucumber.json",
                "junit:Cucumberxml/cucumber.xml",
		        }
		)
public class EggTimerFailedTest {
}