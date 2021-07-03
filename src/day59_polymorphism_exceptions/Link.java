package day59_polymorphism_exceptions;

public class Link implements  WebElement{

    public static  final String TAG_NAME = "a";


    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");

    }

    @Override
    public String  getText() {

        System.out.println("getting link");
        return "Oracle java";
    }

    public void getLinkHref(){

        System.out.println("https://java.com");
    }
}
