package K_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

     WebDriver driver;
    By account = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/div[3]/div/a[2]");
    By eid = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div/section[2]/div/form/div/div[1]/input");
    By pass = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div/section[2]/div/form/div/div[2]/input");
    By submit = By.xpath("//*[@id=\"login-form\"]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccount() {
        driver.findElement(account).click();
    }

    public void login(String emailid, String password) {
        driver.findElement(eid).sendKeys(emailid);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(submit).click();
    }
}
