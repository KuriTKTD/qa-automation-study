package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.SiteReader;
import java.util.List;

public class NavigationSteps {

    WebDriver driver;

    @Given("the user accesses the website")
    public void accessWebsite() throws InterruptedException {
        driver = new ChromeDriver();

        List<String> sites = SiteReader.getSites();

        for (String site:sites){
            driver.get(site);
            Thread.sleep(1000);
        }
    }

}
