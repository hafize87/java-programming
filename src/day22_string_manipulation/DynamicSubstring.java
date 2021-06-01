package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {

        String result = "result count:12345";

        System.out.println(result.substring(13, 18));   // 12345
        System.out.println(result.substring(13));       // 12345

        //find index of :
        System.out.println(result.indexOf(":"));  //12
        int colonIndex = result.indexOf(":");    //12
        System.out.println(result.substring(colonIndex+1));  //12345

        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "i coded [java] today";


        int start = today.indexOf("[");
        int end = today.indexOf("]");

        System.out.println(today.substring(start+1 , end));

        // 2. way


        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));

    }
}
