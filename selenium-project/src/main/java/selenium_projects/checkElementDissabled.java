package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkElementDissabled {

    static WebDriver driver;
    public static void main(String[] args) {

        driver = new FirefoxDriver();

        driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

        // driver.findElement(By.id("pass")).sendKeys("Password@123");

        // After interacting with disabled element we getting below exception
        /*Exception in thread "main" org.openqa.selenium.ElementNotInteractableException:
         Element <input id="pass" name="lname" type="password"> is not reachable by keyboard*/

        // boolean flag = driver.findElement(By.id("pass")).isEnabled();
        // System.out.println(flag);
        
        // invalid attribute value enter for checking exception
        boolean flag = driver.findElement(By.id("pass123")).isEnabled();
        System.out.println(flag);

        // So we are getting NoSuchElementException
        driver.close();
    }

}
