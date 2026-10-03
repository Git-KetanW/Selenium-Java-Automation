package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class elementIsDisplayed {

     static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new EdgeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        boolean flag = driver.findElement(By.id("input-email")).isDisplayed();
        System.out.println(flag);
        driver.close();
    }

    public static WebElement getElement(By locator)
    {
        WebElement Ele = driver.findElement(locator);
        return Ele;
    }

    public boolean isElementDisplayed(By locator)
    {
        try {
            getElement(locator).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Locators are not correct, unable to locate element!!");
            e.printStackTrace();
            return false;
        }
    }
}
