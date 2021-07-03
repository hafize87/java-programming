package day59_polymorphism_exceptions;

public class WebElementUtil {

    public static void clickElement(WebElement element){

        System.out.println("Click on element");
        element.click();


    }


    public  static WebElement getLinkWithText(String txt){

        System.out.println("searcing " + txt);
        return new Link();
    }
}
