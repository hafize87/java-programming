package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main (String[] args){

        int i = 1;
        if(i <= 5){
            System.out.println(i);
        }

        while (i <= 5){
            System.out.println(i);
            i++;
        }


        int apple = 0;
        while (apple <= 10){
            System.out.println("apple = " + apple);
            apple++;
        }
        System.out.println("apple = " + apple);  // 11



        apple = 0;
        if (apple >= 10){
            System.out.println("apple = " + apple);
            apple++;
        }
        System.out.println("apple = " + apple);  // 0




        // infinite loop
        while (true){
            System.out.println("Hello World");
        }
    }
}
