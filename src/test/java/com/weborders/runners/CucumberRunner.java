package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                  "html:target/cucumber-report.html",
                  "rerun:target/rerun.txt"},
        glue = "com/weborders/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@Smoke",
        publish = true

)
public class CucumberRunner {
}