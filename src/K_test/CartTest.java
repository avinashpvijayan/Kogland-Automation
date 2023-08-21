package K_test;

import org.testng.annotations.Test;
import K_page.CartPage;

public class CartTest extends ProductTest {
 
    @Test(priority=3)
    public void testCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(driver);

        cartPage.clickCart();
        cartPage.proceedToBuy();
        Thread.sleep(2000);
        cartPage.removeProduct();
        Thread.sleep(2000);
        cartPage.signOut();
        Thread.sleep(5000);
    }

  /*  @AfterTest
    public void terminate() {
        driver.quit();
    }*/
}
