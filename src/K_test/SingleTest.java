package K_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import K_page.CartPage;
import K_page.LoginPage;
import K_page.ProductPage;

public class SingleTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.kogland.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.clickAccount();
        loginPage.login("avinashpvijayan@gmail.com", "Avi@1997nash");

        productPage.hower1();
        Thread.sleep(5000);
        productPage.click1();
        Thread.sleep(3000);
        productPage.click2();
        Thread.sleep(2000);
        productPage.scroll1();
		Thread.sleep(3000);
		productPage.scroll2();
		Thread.sleep(3000);
		productPage.click3();
		Thread.sleep(2000);
		productPage.pagedown();
		Thread.sleep(2000);
		productPage.load();
		Thread.sleep(2000);
		productPage.pagedown1();
		Thread.sleep(2000);
		productPage.pageup();
		Thread.sleep(2000);
		
		productPage.searching("wound medicine");
		productPage.scroll3();
		productPage.add();
		Thread.sleep(2000);
		productPage.pagup();	
        // ... continue with other actions related to product page

        cartPage.clickCart();
        cartPage.proceedToBuy();
        Thread.sleep(2000);
        cartPage.removeProduct();
        Thread.sleep(2000);
        cartPage.signOut();
        Thread.sleep(5000);
    }

    @AfterTest
    public void terminate() {
        driver.quit();
    }
}
