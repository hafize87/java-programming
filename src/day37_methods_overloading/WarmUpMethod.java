package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {

        loginVoid("hafize", "abc123");      // negative test   // raining day scenario
        loginVoid("cybertekschools", "abc123");   // positive test // sunny day scenario

        System.out.println(login("hafize", "abc123"));
        System.out.println(login("kemal", "acb345"));

        if(login("hafize", "abc123") == true){
            System.out.println("login successfully");
        }
        else{
            System.out.println("Login fail");
        }

        boolean isLoginSuccess = login("nadir","mountain");
        System.out.println("loginSuccess = " + isLoginSuccess);

        if(login("nadir","mountain")){
            System.out.println("Welcome to Canvas");
        }
        else {
            System.out.println("wrong password or username, try again");
        }
    }


    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekschools";
        String secretPassword = "abc123";

        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("login successful");
        } else {
            System.out.println("try again");
        }

    }

        public static boolean login(String username1, String password1){

        String secretUsername1 = "hafize";
        String secretPassword1 = "abc123";

        // 1. way ----------------------
//            if(username1.equals(secretUsername1) && password1.equals(secretPassword1)){
//            return true;
//        }
//        else{
//            return false;
//        }

         // 2. way ---------------------
//            if(username1.equals(secretUsername1) && password1.equals(secretPassword1)){
//                return true;
//            }
//                return false;

         //  3. way --------------------------
            return username1.equals(secretUsername1) && password1.equals(secretPassword1);


    }
}
