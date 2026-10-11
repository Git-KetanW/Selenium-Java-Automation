package selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSupportLang {

    static WebDriver driver;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        List<WebElement> googleLangList = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
        System.out.println(googleLangList.size());


        for(WebElement e:googleLangList)
        {
            String text = e.getText();
            // String text = e.getAttribute("href");
            System.out.println(text);
        }
    }

}
