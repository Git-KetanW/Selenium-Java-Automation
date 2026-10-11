package selenium_projects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageNavigation {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
        driver.navigate().refresh();




        
    }

}
