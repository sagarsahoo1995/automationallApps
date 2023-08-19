package stepDefinitations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;




@CucumberOptions(
        features = "AutomationAPI/src/main/java/features",
        glue = {"AutomationAPI/src/main/java/stepDefinations"})

public class Steps {

}
