package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//resources//login//login.feature"}, glue= {"definition"},
dryRun = false,
plugin = {"html:testoutput/pratik.html"}
		)
//dry run will not execute the code// to check all the steps are implementing// if u dont give curly braces also it will work
public class skillaryRunner {
	
}