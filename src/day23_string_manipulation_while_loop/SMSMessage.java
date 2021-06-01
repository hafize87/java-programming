package day23_string_manipulation_while_loop;

import java.time.chrono.MinguoDate;

public class SMSMessage {
    public static void main(String[] args) {

        String message = "Sender: [ Hafize ] From Number <(222)-334-444> Message:{Hello, lets code some java}";

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        // System.out.println(message.substring(start+1, end));      //Hafize
        //String sender = message.substring(start+1, end);
        // System.out.println("sender = " + sender);     // sender = Hafize

        String sender = message.substring(message.indexOf("[") + 1, message.indexOf("]"));    //sender = Hafize
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<") + 1, message.indexOf(">"));      //mobile = (222)-334-444
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));    //text = Hello, lets code some java
        System.out.println("text = " + text);


        if (sender.equals("Hafize")) {
            System.out.println("Message from Hafize");
        } else {
            System.out.println("someone else message");     // yukardaki mesajda Hafize de basinda ve sonunda bosluk oldugu icin yanlis cikti.
        }                                                 // ama trim ile degistirisem ger bosluklari kapatirsam dogru cikacak


        System.out.println(" hafize ".trim());    // trim sadece basta ve sondaki bosluklari kapatiyor.
        // kelimenin ortasinda olunca olmuyor ex: ha fize olmuyor

        sender = sender.trim();

        if (sender.equals("Hafize")) {
            System.out.println("Message from Hafize");  // sender i trim ile degistirdim basta ve sonda olan bosluklari kaldrdim
                                                        // oyuzden true cikti ve "Message from Hafize"
        } else {
            System.out.println("someone else message");
        }



    }
}
