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

Before starting to work ensure you have some dependencies for those who will not be downloading the various browser drivers. 
1. Selenium Java Dependency (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
2. WebDriver Manager to manage your browsers (https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)

# or 
install the various browser drivers individually on your device 
You will need to download additional components to work with each of the major browsers. The drivers for Chrome, Firefox, and Edge web browsers are all standalone executables that should be placed on your system PATH. Apple's safaridriver is shipped with Safari 10 for OS X El Capitan and macOS Sierra. You will need to enable Remote Automation in the Develop menu of Safari 10 before testing.

Browser	            Component
Chrome	            chromedriver(.exe) (https://chromedriver.chromium.org/downloads)
        Edge	            MicrosoftWebDriver.msi (https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)
        Firefox             geckodriver(.exe) (https://github.com/mozilla/geckodriver/releases)
        Safari	            safaridriver    (http://www.java2s.com/Code/JarDownload/selenium-safari/selenium-safari-driver-2.29.1.jar.zip)


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