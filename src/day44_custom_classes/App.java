package day44_custom_classes;

/**
 * App class is used as a template for App objects.
 * We are describing app properties and behaviour here. Objects will be able to use them
 */

public class App {

    // attribute / data / instance variable

    String name;     // null by default
    double version;   // 0.0 by default

    // behaviour / method

    public void open(){
        System.out.println("opening " + name + " app - version = " + version);
    }
}
