package day10_shorthand_operators;



public class ChangeBalance {
   public static void main (String [] args){
       double balance = 1230.55;
       System.out.println("balance = " + balance);

       double baklava = 22.50;
       System.out.println("baklava = " + baklava);
       // decrease balance by baklava price
       baklava = balance - baklava;
       System.out.println("baklava = " + baklava);

       double kunafe = 44.45;
       System.out.println("kunafe = " + kunafe);
       balance = balance - kunafe;
       System.out.println("kunafe = " + kunafe);

       // second kunafe is 50% off lets buy it.
       kunafe = kunafe /2 ;
       System.out.println("kunafe = " + kunafe);

       // buy it decrace balance with kunafe price
       balance = balance - kunafe;
       System.out.println("kunafe = " + kunafe);

       double plov = 7.99;
       System.out.println("plov = " + plov);
       balance = balance - plov;
       System.out.println("plov = " + balance);

       double iceTea = 3.0;
       System.out.println("iceTea = " + iceTea);
       balance = balance - 4 * iceTea;
       System.out.println("Balace = " + balance);

// return baklava
       System.out.println("Returning baklava = " + baklava);
       balance = balance + baklava;
       System.out.println("balance after returning baklava = " + balance);




       int i = 100;
       double d = 123;
       float f = 300;
       i = (int) f;
       f = i;

   }

}
