package selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class finalLoginTest {

    public static void main(String[] args) {
        
        browserUtility myBrowser = new browserUtility();

        WebDriver driver = myBrowser.LauchBR("Edge");
        myBrowser.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String myTitle = myBrowser.getPageTitle();

        verificationUtitlity.verify(myTitle, "Account Login");

        By emailRef = By.id("input-email");
        By pass = By.id("input-password");

        elementsUtility eu = new elementsUtility(driver);

        eu.doSendKeys(emailRef, "someone@email.com");
        eu.doSendKeys(pass, "Someone@123");
        
        myBrowser.closeBR();
    }
}
