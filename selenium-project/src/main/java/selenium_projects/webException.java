package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webException {

     static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new EdgeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        // here we are getting below error due to incorerct locators
        // Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
        // no such element: Unable to locate element: {"method":"css selector","selector":"#input\-email123"}

        // Now we trying to handle the exception

        try {
            driver.findElement(By.id("input-email123")).sendKeys("someone@email.com");
        } catch (NoSuchElementException e) {
            System.out.println("Element is not found!!");
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());

        driver.close();
    }
}
