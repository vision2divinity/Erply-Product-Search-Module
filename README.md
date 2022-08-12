# Erply-Product-Search-Module

# Prerequisites 

# Built With

1. Java environment
2. Maven
3. MacOS / Windows 
4. Eclipse/IntelliJ IDEA CE


# Installation 

Download and install  IDE's https://www.eclipse.org/downloads/ or https://code.visualstudio.com/
Download and install Java on device from here (https://www.java.com/en/download/) and configure your home environment path

Ensure some Maven dependencies  from their sources below are inserted in the pom.xml file
1. Selenium Java Dependency (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
2. WebDriver Manager to manage your browsers (https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)



# Getting Started 
# 1. Open IDE and create the pom.xml file and add dependencies 
<dependencies>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.3.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.2.3</version>
    </dependency>

</dependencies>

# 2. Begin to create and develop your syntax 

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
        }
        }

driver.get("https://epos.erply.com/");
			
		driver.findElement(By.name("clientCode")).sendKeys("104572");
		driver.findElement(By.name("username")).sendKeys("testassignment");
		driver.findElement(By.name("password")).sendKeys("PosTestAssignment123");

# Searching by product code
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
	    driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")).click();

	    driver.findElement(By.xpath("//input[@id = 'customer-search-input' and @placeholder = 'Products' and @type = 'text']")).clear();

# Searching by product name
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

# Contributing
If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement". Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request