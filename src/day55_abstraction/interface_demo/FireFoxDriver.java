package day55_abstraction.interface_demo;

public class FireFoxDriver implements WebDriver{


    @Override
    public void get(String url) {

        System.out.println("FireFox - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {

        System.out.println("FireFox - locating element by " + locator);
    }

    @Override
    public void quit() {

        System.out.println("FireFox - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "wooden spoon little";
    }
}
