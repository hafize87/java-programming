package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {


        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("youtube");
        mobileApp.useTheApp(10);
        mobileApp.download();


        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(3.1);
        instagram.useTheApp(20);
        instagram.download();


        Discord discord = new Discord();
        discord.setName("Discord");
        discord.setVersion(2.56);
        discord.useTheApp(100);
        discord.download();
        discord.printInfo();
        System.out.println(discord.getName());

    }



}
