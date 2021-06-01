package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        System.out.println("EVEN NUMBERS 0-100");

        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println("\nOOD NUMBERS 0-100");

        for(int j = 1; j<= 100; j++){
            if(j % 2 != 0){
                System.out.print(j + " ");
            }
        }
    }
}
