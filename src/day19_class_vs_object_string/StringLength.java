package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word);
        System.out.println(word.length());   // 4
        System.out.println("Wooden spoon".length());  // 12

        String fistName = "Hafize";
        System.out.println(fistName.length());  // 6

        System.out.println(fistName + " - " + fistName.length());

        int count = fistName.length();
        System.out.println("count = " + count);


        // if statement:
        // when password is at list 6 characters:
        // print: valid amazon
        // else
        // print : password too short

        String password = "abc23";
        if(password.length() >= 6){
            System.out.println("Valid");
        }
        else{
            System.out.println("Password too short");
        }

    }
}
