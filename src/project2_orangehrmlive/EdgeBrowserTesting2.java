package project2_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTesting2 {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.msedge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Open URL
        driver.get(baseUrl);

        // Give implicit time to driver
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(30)));

        // Print the title of the page
       String title =  driver.getTitle();
        System.out.println("Page title is:"+ title);

        // Print current Url
        System.out.println("current url"+driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source"+driver.getPageSource());

        // Enter the username to usernaame field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        // close the broser
        driver.close();

    }
}
