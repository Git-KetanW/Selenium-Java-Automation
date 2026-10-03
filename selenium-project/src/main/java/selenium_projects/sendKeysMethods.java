package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sendKeysMethods {

     static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new EdgeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        String s = "Ketan";
        StringBuilder sb = new StringBuilder("Selenium");
        StringBuffer sbf = new StringBuffer("Java");
        driver.findElement(By.id("input-email")).sendKeys(s,sb,sbf);

        driver.close();
    }

}
