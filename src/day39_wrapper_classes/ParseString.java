package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        String total = "35";
        int num = Integer.parseInt(total);

        System.out.println(num);

        String str = "19.99";
        double money = Double.parseDouble(str);
        System.out.println(money);

        double count = Double.parseDouble("55.99");
        System.out.println(count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }

        String sentence = "I wrote 100 lines of code";
        //split by space , parse index 2 into int

        String [] array = sentence.split(" ");
        int lineOfCode = Integer.parseInt(array[2]);
        System.out.println(lineOfCode);
    }
}
