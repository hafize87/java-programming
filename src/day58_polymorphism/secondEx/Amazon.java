package day58_polymorphism.secondEx;

public class Amazon extends OnlineShop{

    @Override
    public void buy(){
        System.out.println("Buying items from amazon");
    }

    @Override
    public  void sell(){
        System.out.println("selling items from amazon");

    }

    public void primeShipping(){
        System.out.println("Free shipping for amazon");
    }


}
