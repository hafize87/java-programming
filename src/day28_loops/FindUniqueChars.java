package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {

        String word = "java";      //   ===> duplicate olanlari cikariyor

        String unique = "";

        for(int i = 0; i<word.length(); i++){
          //   if word.charAt(i) is not contains in unique
           // add to unique

           if(! unique.contains(word.charAt(i)+ "")){   // contain method sadece String ile calisir. " " double quate u kabul ediyo
               unique += word.charAt(i);                // char i da kabul etmiyor. oyuzden " " koyduk  --> unique.contains(word.charAt(i)+ "")
           }
        }
        System.out.println(unique);


   // ------------------------------------------------------------------------------------------

//        String word = "java";
//
//        String unique = "";
//
//        for(int i = 0; i<word.length(); i++){
//
//
//
//            if(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))){
//                unique += word.charAt(i);
//           }
//        }
//        System.out.println(unique);



    }
}

