package K_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    

	WebDriver driver;
     By cart = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[3]/div/div[2]/a[1]");
     By checkout = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[2]/ul/li/button");
     By remo = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[3]");
     By sdrops = By.xpath("/html/body/div[4]/header/div[2]/div/div[4]/div/div/div/div/div/ul/li[2]/span/button");
    By signo = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[4]/div/div/div/div/div/ul/li[2]/div/ul/li[4]/a");

   

    public CartPage(WebDriver driver) {
    	this.driver = driver;
	}

	public void clickCart() {
        driver.findElement(cart).click();
    }

    public void proceedToBuy() {
        driver.findElement(checkout).click();
    }

    public void removeProduct() {
        driver.navigate().back();
        driver.findElement(remo).click();
    }

    public void signOut() {
        driver.findElement(sdrops).click();
        driver.findElement(signo).click();
    }
}
