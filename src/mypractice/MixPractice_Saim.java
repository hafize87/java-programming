package mypractice;

public class MixPractice_Saim {
    public static void main(String[] args) {
//
//        [Count Letters]
//
//        Create a method that will accept a String and print how many times each characters is found in the String
//
//        Ex:
//        Input: "apple tree"
//
//        Output: a - 1
//                p - 2
//                l - 1
//                e - 3
//     (space char) - 1
//                t - 1
//                r - 1

        String str = "apple tree";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;

                }
            }
            if(count == 1) {
                System.out.println(str.charAt(i) + " - " + count);
            }

        }
    }
}
