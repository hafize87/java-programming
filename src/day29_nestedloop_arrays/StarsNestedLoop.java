package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++){
          //  System.out.println();
            for(int j =1; j<=10; j++){
                System.out.print("* ");
            }
            System.out.println();      // go to next line
        }

        for (int i = 1; i<=10; i++) {
        //    System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // go to next line
        }


        for (int i = 1; i<=10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();  // go to next line
        }
    }
}
