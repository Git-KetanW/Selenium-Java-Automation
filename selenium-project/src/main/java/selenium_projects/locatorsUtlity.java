package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locatorsUtlity {

    static WebDriver driver;
    public static void main(String[] args) {
        
        driver = new EdgeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        // different type of locators used to locate elements from DOM(Document Object Model)

        // 1. "id" attribute 

        // driver.findElement(By.id("input-email")).sendKeys("someone@email.com");
        // driver.findElement(By.id("input-password")).sendKeys("Someone@123");

        // 2."name" attribute

        // driver.findElement(By.name("email")).sendKeys("someone@email.com");
        // driver.findElement(By.name("password")).sendKeys("Someone@123");

        // 3."classname" attribute note class name can be duplicate so we should be avoid for normal circumstances check for duplicate in DOM

        // driver.findElement(By.className("form-control")).sendKeys("someone@email.com");
        // driver.findElement(By.className("form-control")).sendKeys("Someone@123");

        // driver.findElement(By.className("img-responsive")).click(); 

        // 4. Xpath (xml-path) strategy, it's not an attribute. It tell us the address of element

        // driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("someone@email.com");
        // driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Someone@123");
        // driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

        // 5. xpath with utitlity methods
        // By email = By.xpath("//*[@id=\"input-email\"]");
        // By pass = By.xpath("//*[@id=\"input-password\"]");
        // By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

        // elementsUtility EU = new elementsUtility(driver);
        // EU.doSendKeys(email, "someone@email.com");
        // EU.doSendKeys(pass, "Someone@123");
        // EU.doClick(loginButton);

        // 6. CSS (Cascading Style Sheets) as xpath it's not an attribute, it tell about address of element
        
        // driver.findElement(By.cssSelector("#input-email")).sendKeys("someone@gmail.com");
        // driver.findElement(By.cssSelector("#input-password")).sendKeys("Someone@123");
        // driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

        // By email = By.cssSelector("#input-email");
        // By pass = By.cssSelector("#input-password");
        // By loginButton = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");        

        // elementsUtility EU = new elementsUtility(driver);
        // EU.doSendKeys(email, "someone@email.com");
        // EU.doSendKeys(pass, "Someone@123");
        // EU.doClick(loginButton);

        // 7. "links"
        // driver.findElement(By.linkText("Forgotten Password")).click();

        // 8. "partial link text" not used for offen due to duplicasy
        // driver.findElement(By.partialLinkText("Password")).click();

        // 9. "tag name"
       String text = driver.findElement(By.tagName("h2")).getText();
       System.out.println(text);
    }

}
