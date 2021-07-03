package day59_polymorphism_exceptions;

public class InputField implements WebElement{

    public static  final String TAG_NAME = "input";

    @Override
    public void sendKeys(String txt) {

        System.out.println("Typing into input field - " + txt);
    }

    @Override
    public void click() {

        System.out.println("clicking something");
    }

    @Override
    public String getText() {

        System.out.println("getting text from inputField");
        return "java";
    }

    public String getValue(){

        System.out.println("Getting value in the InputField");

        return "selenium";
    }
}
