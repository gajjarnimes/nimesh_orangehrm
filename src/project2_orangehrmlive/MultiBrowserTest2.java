package project2_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest2 {
    static String browser = "Edge";
    static String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;


    public static void main(String[] args) {
      if(browser.equalsIgnoreCase("edge")){
          System.setProperty("webdriver.edge.driver","drivers/edgedriver.exe");
          driver = new EdgeDriver();
      } else if (browser.equalsIgnoreCase("firefox")) {
          driver = new FirefoxDriver();
      } else if (browser.equalsIgnoreCase("Chrome")) {
          driver = new ChromeDriver();
      }else {
          System.out.println("wrong browser name");
      }
      // Open URL
        driver.get(baseUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        // Print the current Url
        System.out.println("current url:"+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source:"+driver.getPageSource());

        // Enter username to username field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Ajay234");

        // Enter password to password field
        WebElement passwordField =  driver.findElement(By.id("password"));
        passwordField.sendKeys("admin123");

        // close the browser
        driver.close();
    }


}





