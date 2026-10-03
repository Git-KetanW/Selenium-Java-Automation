package selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElementFetching {

    static WebDriver driver;
    /* this class is used to fetch all link from webpage and print text with in it */
    public static void main(String[] args) {
        
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        // driver.get("https://www.amazon.in/");

        List<WebElement> listele = driver.findElements(By.tagName("a"));

        System.out.println(listele.size());

        for(int i=0; i<listele.size(); i++)
        {
            String text = listele.get(i).getText();

            if(text.length()!=0)
            {
                System.out.println(text);
            }
        }
        driver.close();
    }

}
