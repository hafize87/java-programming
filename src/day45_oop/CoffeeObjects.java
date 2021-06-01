package day45_oop;

public class CoffeeObjects {
    public static void main(String[] args) {


        Coffee coffee1 = new Coffee();

        System.out.println("coffee amount = " + coffee1.getAmount());

        coffee1.refill();
        System.out.println("amount after refill = " + coffee1.getAmount());
        coffee1.drink(10);
        System.out.println("amount after drink 10 = " + coffee1.getAmount());

        coffee1.setType("Turkish Coffee");
        System.out.println("My coffee = " + coffee1.getType());

        // describe coffee1  - show all variable values
        System.out.println(coffee1.toString());

        Coffee coffee2 = new Coffee();
        coffee2.setType("cappuccino");
        System.out.println("coffee2 type = " + coffee2.getType());

        // assign coffee1 object to coffee2
        Coffee coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());
        coffee3.setType("Espresso");

        Coffee coffee4 = new Coffee();
        coffee4.setType("Frappucino");

        Coffee coffee5 = null;       // reference variable
        coffee5.setType("turkish");
    }
}
