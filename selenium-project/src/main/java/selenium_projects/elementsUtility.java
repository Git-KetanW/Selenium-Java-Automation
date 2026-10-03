package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementsUtility {

    private WebDriver driver;

    public elementsUtility(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getElement(By locator)
    {
        WebElement Ele = driver.findElement(locator);
        return Ele;
    }

    public void doSendKeys(By locator, String value)
    {
        getElement(locator).sendKeys(value);
    }

}
