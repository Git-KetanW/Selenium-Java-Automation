package selenium_projects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class findElements {

    static WebDriver driver;
    public static List<WebElement> getElements(By locator)
    {
        List<WebElement> elementList = driver.findElements(locator);
        return elementList;
    }

    public static int getTotalElementsCount(By locator)
    {
        int count = getElements(locator).size();
        return count;
    }

    public static List<String> getElementsTextList(By locator)
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

    public static void main(String[] args) {
        
        driver = new EdgeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By linkList = By.tagName("a");
        // By imageList = By.tagName("img");

        // // int linkCount = getElements(linkList).size();
        // // ##optimise code with utility method
        // int linkCount = getTotalElementsCount(linkList);
        // System.out.println("Total link from the page is: "+linkCount);

        // // int imageCount = getElements(imageList).size();
        // // ##optimise code with utility method
        // int imageCount = getTotalElementsCount(imageList);
        // System.out.println("The total of images from page is: "+imageCount);

        List<String> listLink = getElementsTextList(linkList);
        System.out.println(listLink);

        if (listLink.contains("Desktops")) 
        {
            System.out.println(("Test case passed!!"));
        }
        else
        {
            System.out.println("Test case failed");
        }
        // driver.close();
    }

}
