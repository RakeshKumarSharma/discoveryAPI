package com.rakesh;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
        "json:target/cucumber.json" }, features = "src/test/resources/cucumber/features")

/**
 * Created by rakesh.sharma on 02/02/2016.
 */
public class CukesRunner {
}
