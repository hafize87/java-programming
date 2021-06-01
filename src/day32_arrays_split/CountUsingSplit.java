package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {

        String cats = "bengal cat tabby cat persian cat no cat here";

        // 1. way
//        String [] cat = cats.split(" ");
//
//        int count = 0;
//        for (String each : cat){
//            if(each.equalsIgnoreCase("cat")){
//                count++;
//            }
//        }
//        System.out.println(count);


        // 2. way

        /** int count = 0;
         for(int i = 0; i < cats.length() - 2; i++) {
         if(cats.substring(i, i +3).equals("cat")) {
         count++;
         }
         }
         System.out.println("count of cats = " + count);
         */

        // 3. way

        String [] catsArray = cats.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length -1));
    }
}
