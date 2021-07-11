package day60_exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

      String word = "java";
     //   String word = null;   //  NullPointerException


        try {
            System.out.println(10/0);
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));  // StringIndexOutOfBoundsException

        }catch (NullPointerException e){
            System.out.println("NullPointerException caught and handled");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong");

        }catch (Throwable t){
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getMessage());
        }

        System.out.println("-- after try and catch --");
    }
}
