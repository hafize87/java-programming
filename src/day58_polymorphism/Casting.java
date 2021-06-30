package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {

        // variable of worker and object of superman

        Worker spMan1 = new SuperMan();
        spMan1.work("QA Manager");
        spMan1.getPaid();


        ((Father)spMan1).raiseKid();
        ((SuperMan)spMan1).playWithKid();


        // DOWNCASTING from worker to superman

        SuperMan spMan2 = (SuperMan) spMan1;
    }


}
