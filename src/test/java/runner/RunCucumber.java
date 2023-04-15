package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(Cucumber.class)
@CucumberOptions(
            plugin = {"json:target/reports/cucumberTests.json", "html:target/reports/cucumberTests.html"},
            features = "src/test/resources/features",
            glue = {"steps"}
            , tags = "@fullTest"
    )

@FixMethodOrder(MethodSorters.DEFAULT)
    public class RunCucumber extends RunBase{

        @AfterClass
        public static void stop(){
            getDriver().quit();
        }
}
