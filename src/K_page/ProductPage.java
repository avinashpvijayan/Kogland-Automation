package K_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
	WebDriver driver;
    
    By medsupply= By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/a");
	 By general= By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/div[2]/div/ul/li[1]/a");
	 By bandages= By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/div[2]/div/ul/li[1]/ul/li[2]/a");
	 By cohesiveband= By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/div[2]/div/ul/li[1]/ul/li[2]/ul/li[3]/a");
	 By bandages1= By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/ul/li[4]/a");
	 By tubularband= By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div[1]/div[2]/ol/li[3]/a");
	 By general1= By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/ul/li[3]/a");
	 By loadmore= By.xpath("//*[@id=\"layer-product-list\"]/div[2]/a[2]");
	 By search= By.xpath("//*[@id=\"search\"]");
	 By searchbutton= By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button");
	 By add2cart= By.xpath("//*[@id=\"layer-product-list\"]/main/div/ol/li[3]/card/div[2]/div[2]/form/button");
	 
	 
	
    public ProductPage(WebDriver driver) {
    	this.driver = driver;
	}
	public void hower1()
	 {
		 WebElement elementToHover = driver.findElement(medsupply);
		 WebElement elementToHover1 = driver.findElement(general);
		 WebElement elementToHover2 = driver.findElement(bandages);
	        Actions actions = new Actions(driver);
	        actions.moveToElement(elementToHover).perform();
	        actions.moveToElement(elementToHover1).perform();
	        actions.moveToElement(elementToHover2).perform();
	        WebElement optionToSelect = driver.findElement(cohesiveband);
	        optionToSelect.click();
	 }
    public void click1()
	 {
		 driver.findElement(bandages1).click();
	 }
	 
	 public void click2()
	 {
		 driver.findElement(tubularband).click();
	 }
	 public void scroll1() throws InterruptedException
	 {
		 WebElement footer = driver.findElement(By.tagName("footer"));
		 int deltaY = footer.getRect().y;
		 Thread.sleep(deltaY);
		 new Actions(driver).scrollByAmount(0, deltaY).perform();

	 }
	 
	 public void scroll2() throws InterruptedException
	 {	Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.PAGE_UP).perform();
		 actions.sendKeys(Keys.PAGE_UP).perform();

	 }
	 
	 public void click3()
	 {
		 driver.findElement(general1).click();
	 }
	 
	 public void pagedown()
	 {Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.PAGE_DOWN).perform();
		 actions.sendKeys(Keys.PAGE_DOWN).perform();
		 actions.sendKeys(Keys.PAGE_DOWN).perform();
	 }
	 
	 public void load()
	 {
		 driver.findElement(loadmore).click();
	 }
	 
	 public void pagedown1()
	 {Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.PAGE_DOWN).perform();
		 actions.sendKeys(Keys.PAGE_DOWN).perform();
		 actions.sendKeys(Keys.PAGE_DOWN).perform();
	 }
	 
	 public void pageup() throws InterruptedException
	 {Actions actions = new Actions(driver);    
		 actions.sendKeys(Keys.PAGE_UP).perform();
		 Thread.sleep(2000);
		 actions.sendKeys(Keys.PAGE_UP).perform();
		 actions.sendKeys(Keys.PAGE_UP).perform();
		
	 }
	 
	 public void searching(String value)
	 {
		 driver.findElement(search).sendKeys(value);
		 driver.findElement(searchbutton).click();
	 }
	 
	 public void scroll3()
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
         
         jsExecutor.executeScript("window.scroll(0,500)");
		}
	 
	 public void add()
	 {
		 driver.findElement(add2cart).click();
	 }
	 
	 public void pagup()
	 {
		 Actions actions = new Actions(driver);
		 actions.sendKeys(Keys.PAGE_UP).perform();
	 }

   
}
