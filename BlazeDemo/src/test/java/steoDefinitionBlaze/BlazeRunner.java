package steoDefinitionBlaze;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
//Cucumber options:
 // Path of our Feature file(s)
 // Glue contains the package(s) where we have implemented our step definitions 
@CucumberOptions (features="src/test/resources/Feature", glue={"steoDefinitionBlaze"}) 

public class BlazeRunner {

}
