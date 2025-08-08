package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("I open Chrome browser")
    public void open_browser() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("I open login page")
    public void open_login_page() {
        driver.get("https://example.com/login");
    }

    @When("I enter username and password")
    public void enter_credentials() {
        System.out.println("Enter username and password here");
        // write code to locate elements and enter values
    }

    @Then("I should see the homepage")
    public void validate_homepage() {
        System.out.println("Validate successful login here from harvey specte);
        System.out.println("Mike Ross");
        driver.quit();
    }
}
