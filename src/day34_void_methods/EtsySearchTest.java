package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {

        System.out.println("-- Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test Completed-Pass-");

    }

    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to etsy");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type wooden spoon");

    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search result are successfully displayed");
    }
}
