package step;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pack.LoginPage;

public class LoginSteps {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User should see dashboard")
    public void userShouldSeeDashboard() {
        String msg = driver.findElement(By.tagName("h1")).getText();
        if(msg.equals("Logged In Successfully")){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
}}
