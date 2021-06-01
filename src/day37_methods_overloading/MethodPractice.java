package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 4, '|'));
        System.out.println(repeatString("java", 5, '-'));
    }

    public static String repeatString(String word, int times, char delimeter){

        String retValue= "";

        for (int i = 1; i <= times; i++){
            // take care of last delimiter
            if(i == times){   // if last iteration
                retValue += word;    // add only word by itself
            }else{
                retValue += word + delimeter;  // add with delimiter
            }

        }
        return retValue;
    }
}
