package day06_arithmetic_operator;

public class MoreMathOperators {
    public static void main (String[] args){
        int toyotas = 431;
        int hondas = 233;
        byte vw = 2;
        byte tesla =20;
        byte nissan = 1;
        int bmw =155;
        int total = toyotas + hondas +vw + tesla + nissan + bmw;

        System.out.println("There are " + total + " parking lots.");

        String pizza = "hawaiian";
        int slice = 8;
        int people = 4;
        int slicePerPerson = slice / people;
        // There are 2 slice per person.
        System.out.println("There are " + slicePerPerson + " slice per person.");

        // We ordered hawaiian pizza with 8 slices, 4 people ate 2 slice each.
        System.out.println("We ordered " + pizza + " pizza with " + slice + " slices, " + people +
                " people ate " + slicePerPerson + " slice each." );
    }
}
