package officehours.practice_03_24_2021;

public class CharIndex {
    public static void main(String[] args) {

          /*
            Index

            java is
            0123456


            charAt(int) -> gives a char
            indexOf(char) -> gives a int (index)


         */

        String s = "java";
        //          0123
        // charAt(4) -> exception
        //  System.out.println(s.charAt(s.length())); // StringIndexOfOutBoundsException
        System.out.println(s.charAt(s.length()-1)); // a


//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        System.out.println(s.charAt(0) + "" + s.charAt(3));

        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        // JAVA
        System.out.println(upper);




    }
}
