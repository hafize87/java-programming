package day38_methods;

// import all static methods. so that you can just call by method name, without classname
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {

        String username = "";
        if(StringUtils.isNullOrEmpty(username)){
            System.out.println("FAIL: Username cannot be null or empty");

            System.out.println(isPalindrome("mom"));  //  true
            System.out.println(isPalindrome("hafize"));   // false
            System.out.println(isPalindrome("civic"));  // true

            System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
            System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak") );
            System.out.println("isPalindrome(cybertek) = " + StringUtils.isPalindrome("cybertek"));


            System.out.println("Reverse(hafize) = " + StringUtils.reverse("hafize"));
            System.out.println("Reverse(kemal) = " + StringUtils.reverse("kemal"));
            System.out.println("Reverse(java) = " + StringUtils.reverse("java"));

            String word = "love";
            String revWord = StringUtils.reverse(word);
            System.out.println("word = " + word);
            System.out.println("revWord = " + revWord);
        }
    }



}
