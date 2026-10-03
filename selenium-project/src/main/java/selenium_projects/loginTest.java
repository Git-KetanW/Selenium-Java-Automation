package selenium_projects;

public class loginTest {

    public static void main(String[] args) {
        
        browserUtility br = new browserUtility();
        
        br.LauchBR("EDGE");
        br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        String page = br.getPageTitle();
        verificationUtitlity.verify(page, "Account Login");

        String pageURL = br.getPageUrl();
            System.out.println("Here is current page url: "+pageURL);
            verificationUtitlity.verifyContains(pageURL, "opencart");

        br.closeBR();
    }
}
