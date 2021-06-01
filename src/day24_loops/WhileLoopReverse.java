package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {


        int count = 5;
        while (count >= 0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished the count");





        int unreadSMS = 10;
        // read each message 1 by 1 until you have 0 unread sms
        // while unread ssm more than 0 read 1 bye 1

        while (unreadSMS > 0){
            System.out.println("I have total : " + unreadSMS + " unread message");
            --unreadSMS;
        }
        System.out.println("No message");
    }
}
