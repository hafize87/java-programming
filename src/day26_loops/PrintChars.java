package day26_loops;

public class PrintChars {
    public static void main(String[] args) {

        String word = "hafize";

        for (int i = 0; i < word.length(); i++){                        // h
                                                                        // a
            System.out.println(word.charAt(i));                         // f
                                                                        // i
        }

        System.out.println();

            word = "kemal";   //index = 4   ===> geriden giderken word.length()-1 olacak. ve i>=0 olacak.  (=) i unutma!!!

        for (int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }


}
