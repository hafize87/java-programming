package day61_exceptions;

public class ElementaryStudentsTest {
    public static void main(String[] args) {



        try {
            ElementarySchool el1 = new ElementarySchool();
            el1.setName("bob");
            el1.setAge(1);
            System.out.println(el1.toString());

        }catch (IllegalArgumentException e){
            e.printStackTrace();  // print error stack trace and continue. does not stop code.
        }

        System.out.println("--- Execution completed ---");




    }
}
