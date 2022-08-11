import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FirstSelenium {

	public static void main(String[] args) {
	
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://epos.erply.com/");
		
		
		driver.findElement(By.name("clientCode")).sendKeys("104572");
		driver.findElement(By.name("username")).sendKeys("testassignment");
		driver.findElement(By.name("password")).sendKeys("PosTestAssignment123");
		
		//This is to check number button if it works
		/*driver.findElement(By.xpath("//a[.='+1(855) 463-7759']")).click();
		try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }*/
		
		/*This is to check for the forgot password module
		driver.findElement(By.xpath("//a[.='Forgot password']")).click();
		driver.findElement(By.xpath("//input[@name='account']")).sendKeys("104572");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yesin@eay.jp");
		try {
	        Thread.sleep(10000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }*/
		
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		//driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")).click();
		//driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/div[1]/img[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/div[1]/img[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/div[1]/img[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/div[1]/img[1]")).click();
		//driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")).click();
		//driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Request Password Reset']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='« Back']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='dark-row row']//span[.='Sign In']")).click();
		
		try {
	        Thread.sleep(10*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click(); 
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		//Searching by customer name
		//driver.findElement(By.id("customer-search-input")).sendKeys("Rifaqqq Khan");
	    //driver.findElement(By.xpath("customer-search-input")).sendKeys(Keys.ENTER);
		
		//Searching by product code
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).click();
		
		try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("0");
		
		try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		//driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		//driver.findElement(By.xpath("//span[@class='MuiIconButton-label']")).click();
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    
		
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("001");

		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
	    driver.findElement(By.xpath("//div[@id='product-search-container']/div[2]/div/div/table/tbody/tr/td[3]")).click();
	    
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    //this is for adding item and paying
	    driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();
	    driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		//driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("0001");
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//div[@id='product-search-container']/div[2]/div/div/table/tbody/tr/td[3]")).click();
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		//driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
				
		
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("STRAWBERRY1");
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//div[@id='product-search-container']/div[2]/div/div/table/tbody/tr/td[3]")).click();
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		//driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
				
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		//Searching by product name
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("Example product");
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		 driver.findElement(By.xpath("//div[@id='product-search-container']/div[2]/div/div/table/tbody/tr/td[3]")).click();
		 try {
		        Thread.sleep(2000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		 driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();
		 driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		 //driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
			
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("Fanta");
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//div[@id='product-search-container']/div[2]/div/div/table/tbody/tr/td[3]")).click();
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		//driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
				
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys("Strawberry-Banana Margarita");
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//div[@id='product-search-container']/div[2]/div/div/table/tbody/tr/td[3]")).click();
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();
		//driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();
		
		//driver.close();
		
		//this is to try and use the pay button
		driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]/span[1]")).click();
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
				
		
		
		
		
		
	}

}
