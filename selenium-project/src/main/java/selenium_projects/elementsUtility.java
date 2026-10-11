package selenium_projects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
        if(value == null)
        {
            throw new elementException("==Invalid String value, Null not allowed to be enter");
        }
        else
        {
            getElement(locator).sendKeys(value);
        }
    }

     public void doMultipleSendKeys(By locator, CharSequence...value)
    {
      getElement(locator).sendKeys(value);
    }

    public void doClick(By locator)
    {
        getElement(locator).click();
    }

    public String doGetText(By locator)
    {
        String text = getElement(locator).getText();
        return text;
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

        public boolean isElementEnabled(By locator)
    {
        try {
            getElement(locator).isEnabled();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Element is disabled on page!!");
            e.printStackTrace();
            return false;
        }
    }

     public String getAttributeValue(By locator, String attrName)
    {
        String attrValue = getElement(locator).getAttribute(attrName);
        return attrValue;
    }

    public String getDomPropertyValue(By locator, String attrName)
    {
        String attrValue = getElement(locator).getDomProperty(attrName);
        return attrValue;
    }

    public String getDomAttributeValue(By locator, String attrName)
    {
        String attrValue = getElement(locator).getDomAttribute(attrName);
        return attrValue;
    }

    public List<WebElement> getElements(By locator)
    {
        List<WebElement> elementList = driver.findElements(locator);
        return elementList;
    }

    public int getTotalElementsCount(By locator)
    {
        int count = getElements(locator).size();
        return count;
    }

    public List<String> getElementsTextList(By locator)
    {
        List<WebElement> tL = getElements(locator);
        List<String> textList = new ArrayList<String>();
        for(WebElement e:tL)
        {
            String text = e.getText();
            if (text.length()!=0) 
            {
                textList.add(text);
            }
        }
        return textList;
    }

}
