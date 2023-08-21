package K_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import K_page.page;



public class test {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.kogland.com/");
		driver.manage().window().maximize();
	
	}
	@Test
	public void testing() throws InterruptedException
	{ 
		page id= new page(driver);
		
		id.hower1(); 
		Thread.sleep(5000);
		id.click1();
		Thread.sleep(3000);
		id.click2();
		Thread.sleep(2000);
		id.scroll1();
		Thread.sleep(3000);
		id.scroll2();
		Thread.sleep(3000);
		id.click3();
		Thread.sleep(2000);
		id.pagedown();
		Thread.sleep(2000);
		id.load();
		Thread.sleep(2000);
		id.pagedown1();
		Thread.sleep(2000);
		id.pageup();
		Thread.sleep(2000);
		
		id.searching("wound medicine");
		id.scroll3();
		id.add();
		Thread.sleep(2000);
		id.pagup();		
		Thread.sleep(2000);
		id.acc();
		id.login("avinashpvijayan@gmail.com","Avi@1997nash");
		id.cart1();
		id.proceedbuy();
		Thread.sleep(2000);
		id.remove();
		Thread.sleep(2000);
		id.signout();		
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void terminate()
	{
		driver.quit();
	}
}
