package selenium_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browserUtility {

    static WebDriver driver;

    public WebDriver LauchBR(String browsername)
    {
        System.out.println("You are using browser: "+browsername+" see it started!!" );

        switch ((browsername).toLowerCase().trim()) {
            case "chrome":
                    System.out.println("Here we are launching Mr. Chrome!");
                    driver = new ChromeDriver();
                break;
            
            case "edge":
                    System.out.println("Here we are launching Mrs. Edge!");
                    driver = new EdgeDriver();
                break;
            
            case "firefox":
                    System.out.println("Here we are launching Mr. Firefox!");
                    driver = new FirefoxDriver();
                break;

            case "Safari":
                    System.out.println("Here we are launching Mr. Safari!");
                    driver = new SafariDriver();
                break;

            default:
                System.out.println("Hey my buddy you entered invalid match for browser-name. Please check and re-enter!!");
                throw new exceptionUtitlity("Please reconsider your enter credentials");
        }
        return driver;
    }
    
    public void launchURL(String url)
        {
            System.out.println("Here is the url for cuurent page: "+url);
                if (url.indexOf("http")!=0) 
                {
                    throw new exceptionUtitlity("Invalid Argument -->> HTTP/HTTPS is missing from your url");
                }
                else
                {
                    driver.get(url);
                }
        }

    public String getPageTitle()
    {
        String title = driver.getTitle();
        return title;
    }

    public String getPageUrl()
    {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void closeBR()
    {
        driver.close();
    }

    public void quitBR()
    {
        driver.quit();
    }
}
