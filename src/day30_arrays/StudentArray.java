package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5];

        student1[0] = "AD12345";
        student1 [1] = "hafize";
        student1 [2] = "aksoy";
        student1 [3] = "B22";
        student1 [4] = "480-241-9088";

        // bu yoluda kullanabiliriz kisa yol

        String [] student2 = {"12345", "kemal", "Aksoy", "b23", "467-823-9099"} ;

        System.out.println("students = " + student1 [0] );
        System.out.println("students firstname = " + student1 [1]);
        System.out.println("students lastname = " + student1 [2]);
        System.out.println("students batch " + student1 [3] );
        System.out.println("students phone = " + student1 [4] );


        System.out.println("students data length: " + student1.length);

        if(student1.length == 5){
            System.out.println("PASS: data array has correct length");
        }
        else{
            System.out.println("FAIL: data array has incorrect length");
        }

        if(student1.length == student2.length){
            System.out.println("TRUE: data array length match");
        }
        else{
            System.out.println("FALSE: data array length not match");
        }

                           // hafize                            aksoy
        System.out.println(student1 [1].toUpperCase() + " " + student1[2].toUpperCase());


        System.out.println();
        System.out.println("student = " + student2 [0] );
        System.out.println("student firstname = " + student2 [1]);
        System.out.println("student lastname = " + student2 [2]);
        System.out.println("student batch " + student2 [3] );
        System.out.println("student phone = " + student2 [4] );



    }
}
