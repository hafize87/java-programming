package day54_abstraction.menu;

public class Pizza extends MenuItem{

    @Override
    public void prepare(){

        System.out.println("put mashroom , onion, ");

    }

    @Override
    public  void serve(){

        System.out.println("serve in plate or in a box");
    }
}
