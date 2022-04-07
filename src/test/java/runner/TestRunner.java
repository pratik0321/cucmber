package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//here we execute the cucumber file
//@RunWith is used when we specifically run a file,class 
@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/resources/login/login.feature"},glue = {"definition"})


public class TestRunner {
	
	
}
