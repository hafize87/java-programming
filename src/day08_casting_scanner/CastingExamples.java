package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {

        //byte - short - int - long

        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;

        // float - double
        float num6 = 124.F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);   //3456
        System.out.println("num9 = " + num9);   // 3456.0


        System.out.println("=============================");

        int num10 = 22;
        byte num11 = (byte) num10;
        short num12 = (short) num10; // cast/covert to smaller short

        System.out.println("num10 = " + num10);
        System.out.println();


        double num13 = 55.3;
        float num14 = (float) num13;
        System.out.println(num13);
        System.out.println(num14);

        double num15 = 1234.5;
        int num16 = (int) num15;
        System.out.println(num15);  //1234.5
        System.out.println(num16); //1234

        int num17 = 300;
        byte num18 = (byte) num17;
        System.out.println(num17);  //300
        System.out.println(num18);  //44


        // CASTING CHAR TO INT
         char letter = 'H';
         int let = letter;
        System.out.println(letter);  // h
        System.out.println(let);     //72

        int  i = 3456;
        char ch = (char) i;
        System.out.println(i);    //3456
        System.out.println(ch);    // ඀











    }
}
