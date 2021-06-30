package day58_polymorphism.secondEx;

public abstract class OnlineShop implements Prime{

    public abstract void buy();

    public abstract void sell();

    public void ship(){

        System.out.println("Shipping the purchased items");
    }
}
