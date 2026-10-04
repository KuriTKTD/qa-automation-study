package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class NavigationSteps {

    WebDriver driver;

    @Given("the user accesses the website")
    public void accessWebsite(){
        driver = new ChromeDriver();
        driver.get(ConfigReader.get("baseUrl"));
    }

}
