package de.sconto;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "de/sconto/stepDefinitions",
        tags = "@wrongEmail"
)
public class TestRunner {
}



