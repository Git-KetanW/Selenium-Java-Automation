package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextFieldValue {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        driver.findElement(By.id("input-email")).sendKeys("Something@email.com");

        // # 1st O/P
        // with .getDomAttribute we are able to fetch input text from textbar
        // String text = driver.findElement(By.id("input-email")).getAttribute("value");
        By email = By.id("input-email");
        String text = getAttributeValue(email, "value");
        System.out.println("Here is .getAttribute output: "+text);

        // # 2nd O/P
        // with .getDomAttribute we are not able to fetch input text from textbar
        //  String domtext = driver.findElement(By.id("input-email")).getDomAttribute("value");
        By emailAttribute = By.id("input-email");
        String domtext = getDomAttributeValue(emailAttribute, "value");
        System.out.println("Here is .getDomAttribute output: "+domtext);

        // # 3rd O/P
        // with .getDomAttribute we are able to fetch input text from textbar
        //  String domPRtext = driver.findElement(By.id("input-email")).getDomProperty("value");
        By emailProperty = By.id("input-email");
        String textProperty = getDomPropertyValue(emailProperty, "value");
        System.out.println("Here is .getDomProperty output: "+textProperty);

    }

    public static WebElement getElement(By locator)
    {
        WebElement Ele = driver.findElement(locator);
        return Ele;
    }

    public static String getAttributeValue(By locator, String attrName)
    {
        String attrValue = getElement(locator).getAttribute(attrName);
        return attrValue;
    }

    public static String getDomPropertyValue(By locator, String attrName)
    {
        String attrValue = getElement(locator).getDomProperty(attrName);
        return attrValue;
    }

    public static String getDomAttributeValue(By locator, String attrName)
    {
        String attrValue = getElement(locator).getDomAttribute(attrName);
        return attrValue;
    }

}
