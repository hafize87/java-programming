package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
//      Interwiew question genelde bu 3 sekilde soruyolarmis. 3. sorunun cevabi burada
//        1) find duplicates and count
//        2) find unique characters(appearing only once)
//        3) print character and number of occurrences

        String word = "java";

        for(int i = 0; i< word.length(); i++){
            for (int j = 0; j<=i; j++ ){
                System.out.print(word.charAt(j)+ " ");
            }
            System.out.println();
        }


       word = "java";

        for(int i = 0; i< word.length(); i++){
            for (int j = i; j<word.length(); j++){
                System.out.print(word.charAt(j)+ " ");
            }
            System.out.println();
        }



    }
}
