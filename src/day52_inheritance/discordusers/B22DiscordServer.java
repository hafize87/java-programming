package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setId(1234);
        user1.setName("hafize");
        user1.setRole("student");


        // user constructor >  Admin constructor
        Admin admin1 = new Admin();
        admin1.setId(8765);
        admin1.setName("Mike");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Mike", 234);
        System.out.println(admin2.toString());
    }
}
