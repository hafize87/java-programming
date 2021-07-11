package day61_exceptions.checked_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

        // 1 way - Handling using try catch
        System.out.println("About to sleep for 5 seconds");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("woke up after 5 second");


        //2 way - Declaring using throws keyword

        Thread.sleep(1000);  // yukariya method seklinde yaziyorsun  -- >  throws InterruptedException
    }


}
