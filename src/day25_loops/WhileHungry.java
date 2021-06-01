package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {


        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while (isHungry){
            bananas++;
            System.out.println("Eat banana " + bananas);

           // isHungry = bananas == countToFull? false: true;     ==> ternary if statement

            if(bananas == countToFull){
                isHungry = false;
            }
 }
        System.out.println("had enough bananas, lets back to study");





    }
}