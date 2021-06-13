package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone){

        System.out.println("Chatting with " + someone + " on discord");
    }

    /*
    override downloaded method
     */

    @Override
    public boolean download(){

        System.out.println("Downloaded Discord ");

        return true;
    }

    @Override
    public void useTheApp(int minutes){

        super.useTheApp(minutes);
        chat("Mike");
    }

    public void printInfo(){
        System.out.println("App name : " + getName());
        System.out.println("App version : " + getVersion());
    }
}
