package K_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import K_page.LoginPage;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.kogland.com/");
        driver.manage().window().maximize();

        /* Perform the login action
        loginPage = new LoginPage(driver);
        loginPage.clickAccount();
        loginPage.login("avinashpvijayan@gmail.com", "Avi@1997nash");*/
    }

  /*  @AfterTest
    public void terminate() {
        driver.quit();
    }*/
}
