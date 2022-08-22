package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"StepDefinitions"},
monochrome= true,
plugin ={"pretty","html:target/HtmlReports"},tags="@Success or @Bus or @Error or @Forex ")
//or @Bus or @Error or @Forex 

public class TestRunner {

}
