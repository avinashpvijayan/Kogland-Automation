package K_test;
import org.testng.annotations.Test;
import K_page.ProductPage;
public class ProductTest extends LoginTest {


    @Test(priority=2)
    public void testProductPage() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);

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
        Thread.sleep(2000);
    }

  /* @AfterTest
    public void terminate() {
        driver.quit();
    }*/
}
