package officehours.practice_03_31_2021;

public class Examples {
    public static void main(String[] args) {


        // +=

        // number
        // += shorthand for addition
        // number = number + 5  <==>  number += 5;

        // String
        // += concatenation
        // str = str + "new word"; <==> str += "new word";

        String str ="java";
        char letter = 'a';
        int count = 0;

        for(int i =0; i < str.length(); i++) {
            if(str.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println(letter + " was found " + count + " times in " + str);


//
//        String str = "2juMp41EEkd4s4";
//        int upperCase = 0, lowerCase = 0, number = 0;
//
//        for(int i=0; i < str.length(); i++) {
//
//            char eachLetter = str.charAt(i); // 2 -> ascii: 50
//
//            if(eachLetter >= 'A' && eachLetter <= 'Z') {
//                upperCase++;
//            } else if(eachLetter >= 'a' && eachLetter <= 'z') {
//                lowerCase++;
//            } else if(eachLetter >= '0' && eachLetter <= '9'){ // 48 - 57
//                number++;
//            }
//
//        }
//
//        System.out.println("uppercase = " + upperCase);
//        System.out.println("lowerCase = " + lowerCase);
//        System.out.println("number = " + number);
    }
}
