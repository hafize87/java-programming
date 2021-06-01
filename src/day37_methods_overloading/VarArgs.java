package day37_methods_overloading;

public class VarArgs {

    public static void main(String[] args) {

        addNumbers(10,3);
        addNumbers(11,65,4,3,5,23,45,654,98,43,456,66,456); //  --> istedigin kadar numara koyabilirsin 3 tane nokta koyunca
        addNumbers();

     //   int ... myNumber = 10,4      ---> ERROR , var args can ONLY be used as a method parameter


    }
                                    // var args 0 - more
    public static void addNumbers(int... nums) {

        // inside the method , it used as regular array
        int sum =0;

        for(int each : nums){
            sum += each;
        }
        System.out.println("sum = " + sum);

    }
}
