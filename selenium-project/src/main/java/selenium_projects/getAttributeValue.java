package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeValue {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        String attributeValue = driver.findElement(By.id("input-email")).getAttribute("placeholder");
        System.out.println(attributeValue);

        // .getDomAttribute() and .getDomProperty()

        String domValue = driver.findElement(By.linkText("Forgotten Password")).getDomAttribute("href");
        System.out.println(domValue);

        String domPropertyValue = driver.findElement(By.linkText("Forgotten Password")).getDomProperty("href");
        System.out.println(domPropertyValue);

        driver.close();
        
    }

}
