package selenium_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://sauce-demo.myshopify.com/");

        String URL = driver.getCurrentUrl();
        System.out.println("The current url is: "+URL);

        String title = driver.getTitle();
        System.out.println("The current page title is: "+title);

        driver.close();

        // driver.quit();
    }

}
