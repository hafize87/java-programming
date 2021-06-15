package officehours.practice_06_14_2021;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy = new Candy("generic", -10, true);
        System.out.println(candy);

        Take5 bar1 = new Take5(5, false);
        System.out.println(bar1);

        Twix bar2 = new Twix(2, false);
        System.out.println(bar2);


        System.out.println(Candy.getTotalNumOfCandy());

    }
}
