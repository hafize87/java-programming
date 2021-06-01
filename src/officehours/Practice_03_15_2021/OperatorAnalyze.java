package officehours.Practice_03_15_2021;

public class OperatorAnalyze {
    public static void main(String[] args) {
        //        Analyze the following without intellij. Calculate the output step by step
//          int a = 5; // 5
//          int b = a++ + a-- + a * 2 + a + ++a;
//        What is the value of a and b?

        int a = 5;
        //       5  +  6  + 5 * 2 + 5 + 6
        int b = a++ + a-- + a * 2 + a + ++a;

        System.out.println("a = " + a);    //6
        System.out.println("b = " + b);     // 32

//            Analyze the following without intellij. Calculate the output step by step
//        int a = 200;
//       int b = -a++ + - --a * a-- % 2 + b;
//            What is the value of a and b?

        int c = 200;
        //      -200 + - 200 * 200 % 2 + 199
        int d = -c++ + - --c * c-- % 2 + c ;
        System.out.println("c = " + c);       //199
        System.out.println("d = " + d);         // -1


//         Analyze the following without intellij. Calculate the output step by step
//        int x = 300;
//        int y = 400;
//        int z = x + y - x * y + x / y;
//         What is the value of x, y, and z?

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;

        System.out.println("x = " + x);  //300
        System.out.println("y = " + y);    //400
        System.out.println("z = " + z);    // -119300



    }
}
