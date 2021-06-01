package day19_class_vs_object_string;

public class StringStartWithEndsWith {
    public static void main(String[] args) {

        String word = "java love";

        System.out.println(word.startsWith("j"));  // true
        System.out.println(word.startsWith("jav"));  // true
        System.out.println(word.startsWith("a"));  // false
        System.out.println(word.startsWith("love"));   // false


        System.out.println(word.endsWith("love"));    // true
        System.out.println(word.endsWith("e"));      // true
        System.out.println(word.endsWith("alove"));  // false

        String name = "Irina";

        if (name.endsWith("a")) {
            System.out.println("Maybe, it is a female name");
        }


        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Dr. Nadir";

        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single mom");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid");
        }




        String url ="https://education.oracle.edu";


        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(url.endsWith(".ru")){
            System.out.println("Russian website");
        }
        else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }
        else if(url.endsWith(".edu")){
            System.out.println("Education website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }
        else{
            System.out.println("Invalid");
        }


    }
}
