package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementBasic {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    // In ths class we dealing with the web elements.
    // how should we automate/interact with them

    //  # Approch-->>01___Here we locating web element and passing value directly
        // driver.findElement(By.id("input-email")).sendKeys("someOne@email.com");
        // driver.findElement(By.id("input-password")).sendKeys("Mypass@123");

    //  # Approch-->>02
        // WebElement Uname = driver.findElement(By.id("input-email"));
        // WebElement Pass = driver.findElement(By.id("input-password"));

        // Uname.sendKeys("someOne@email.com");
        // Pass.sendKeys("Mypass@123");

    //  # Approch-->>03 Here we maintaing separate by locators, invocking webelements when actual time of locatitng
        // By emailRef = By.id("input-email");
        // By passRef = By.id("input-password");

        // WebElement email = driver.findElement(emailRef);
        // WebElement pass = driver.findElement(passRef);

        // email.sendKeys("someOne@email.com");
        // pass.sendKeys("Mypass@123");

    //  # Approch-->>04
    // By emailRef = By.id("input-email");
    // By passRef = By.id("input-password");

    // WebElement email = getElement(emailRef);
    // WebElement pass = getElement(passRef);

    // email.sendKeys("someOne@email.com");
    // pass.sendKeys("Mypass@123");

    //  # Approch-->>05
    // By emailRef = By.id("input-email");
    // By passRef = By.id("input-password");

    // doSendKeys(emailRef, "someOne@email.com");
    // doSendKeys(passRef, "Mypass@123");

    //  # Approch-->>06
    By emailRef = By.id("input-email");
    By passRef = By.id("input-password");

    elementsUtility EU = new elementsUtility(driver);
    EU.doSendKeys(emailRef, "someOne@email.com");
    EU.doSendKeys(passRef, "Mypass@123");
    }
}
