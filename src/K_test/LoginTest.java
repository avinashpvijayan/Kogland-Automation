package K_test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import K_page.LoginPage;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.kogland.com/");
        driver.manage().window().maximize();
    }

    @Test(priority=1)
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickAccount();
        loginPage.login("avinashpvijayan@gmail.com", "Avi@1997nash");
        Thread.sleep(5000);
    }

 /*   @AfterTest
    public void terminate() {
        driver.quit();
    }
*/
}
