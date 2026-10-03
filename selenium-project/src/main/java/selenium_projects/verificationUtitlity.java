package selenium_projects;

public class verificationUtitlity {

    public static boolean verify(String actualValue, String expectedValue)
    {
        System.out.println("Actual value is: "+actualValue);

        if (actualValue.equals(expectedValue)) 
            {
                System.out.println("Actual value: "+actualValue+" is equal to "+expectedValue);
                return true;
            }
        else
        {
            System.out.println("Actual value: "+actualValue+" is not equal to "+expectedValue);
            return false;
        }
    }

    public static boolean verify(int actualValue, int expectedValue)
    {
        System.out.println("Actual value is: "+actualValue);

        if (actualValue == expectedValue) 
            {
                System.out.println("Actual value: "+actualValue+" is equal to "+expectedValue);
                return true;
            }
        else
        {
            System.out.println("Actual value: "+actualValue+" is not equal to "+expectedValue);
            return false;
        }
    }

    public static boolean verifyContains(String actualValue, String expectedValue)
    {
        System.out.println("Actual value is: "+actualValue);

        if (actualValue.contains(expectedValue)) 
            {
                System.out.println("Actual value: "+actualValue+" is equal to "+expectedValue);
                return true;
            }
        else
        {
            System.out.println("Actual value: "+actualValue+" is not equal to "+expectedValue);
            return false;
        }
    }

}
