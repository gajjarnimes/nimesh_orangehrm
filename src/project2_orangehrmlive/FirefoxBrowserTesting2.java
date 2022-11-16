package project2_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.sql.Driver;
import java.time.Duration;

public class FirefoxBrowserTesting2 {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open URL
        driver.get(baseUrl);

        // Give implicit time to driver
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        // Print the current Url
        System.out.println("current url:"+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source:"+driver.getPageSource());

        // Enter username to username field
       WebElement usernameField = driver.findElement(By.name("username"));
       usernameField.sendKeys("Admin");

       // Enter password to password field
       WebElement passwordField =  driver.findElement(By.id("password"));
       passwordField.sendKeys("admin123");

       //close the browser
        driver.close();
    }
}
