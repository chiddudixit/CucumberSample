package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(feature="Feature\\Demo1.feature",glue= {"StepDef"})
public class TestRunner {

}
