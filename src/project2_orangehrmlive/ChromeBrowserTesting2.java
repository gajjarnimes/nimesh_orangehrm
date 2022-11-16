package project2_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting2 {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Open URL
        driver.get(baseUrl);

        // Give implicit time to driver
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(60)));

        // Print the title page
       String title = driver.getTitle();
        System.out.println("Page title is"+ title);

        // Print current URL
        System.out.println("current url"+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source"+driver.getPageSource());

        //Enter the username  to username field
       WebElement usernameField = driver.findElement(By.name("username"));
       usernameField.sendKeys("Admin");

        // Enter the Password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //close the browser
        driver.quit();
    }
}
