package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pack.LoginPage;
public class LoginTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        // 1 POM-dan istifadə
        LoginPage loginPage = new LoginPage(driver);

        // 2 Test addımları
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickLogin();

        // 3 Nəticəni yoxla
        String successMsg = driver.findElement(By.tagName("h1")).getText();
        if(successMsg.equals("Logged In Successfully")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
}}
