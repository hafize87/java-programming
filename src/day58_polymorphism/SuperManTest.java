package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

      Father spMan1  = new SuperMan();

      spMan1.playWithKid();
      spMan1.raiseKid();
      spMan1.feedKid();
      //  spMan1.work("SDET") --> ERROR sadece data type da hango methodlar varsa onu cagirir
                                //  spMan1 is Father type can only access methods in father

      Worker spMan2 = new SuperMan();
      spMan2.getPaid();
      spMan2.work("SDET");
     //  spMan2.feedKid();  --> ERROR sadece Worker da olan methodlari alir
                               //  spMan2 is Worker type can only access methods in Worker


        SuperMan spMan3 = new SuperMan();  // SuperMan now access to all methods.
        spMan3.getPaid();                   // herzaman data type bak sol tarafa bak onun icinde ne varsa onu yazacaksin
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();
        spMan3.work("QA");


    }
}
