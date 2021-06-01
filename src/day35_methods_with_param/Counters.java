package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(5);
        count(2);
        int num1 = 999;
        count(num1);
        String word = "wooden spoon";
        count(word.length());  // 1 2 3 4 5 6 7 8 9 10 11 12
        printAge(1987);
        int birthYear = 2001;
        printAge(birthYear);
    }

    public static void count (int num){

        for (int i = 1; i <= num ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021 - year;   // calculate age
        System.out.println("Birth year: " + year + ". Age: " + age);
       // System.out.println("Age = " + (2021 - year));
    }
}
