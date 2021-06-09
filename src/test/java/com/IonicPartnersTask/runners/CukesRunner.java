package com.IonicPartnersTask.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/IonicPartnersTask/step_definitions",
        dryRun = false,
        tags = "@test1"
)
public class CukesRunner {


}