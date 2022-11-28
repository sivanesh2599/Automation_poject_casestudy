package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/tatacliq/accessories.feature"}, glue="definition", plugin= {"html:report/htmlreport.html"})
public class test_runner {

}
