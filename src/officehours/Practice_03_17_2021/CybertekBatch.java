package officehours.Practice_03_17_2021;

import java.util.Scanner;

public class CybertekBatch {
    public static void main(String[] args) {

        //        In Cybertek we have three batch types: US morning, US evening, EU.
//        Depending on a batch type (String) print information about the batch.
//        First figure out is is a US batch or EU batch
//            - for US batches:
//       > Figure out is it a morning batch or evening batch
//            > morning - print: Class times are 10-5 EST. M, T, Th, F.
//                > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
//
//             - for EU batches:
//           > print: Class times are  10-5 EST. M, T, W, Th, F.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter batch type");
        String batch = input.next();
        System.out.println("Enter morning or evening batch");
        String batchtime = input.next();

        if(batch.equals("US")){
            if(batchtime.equals("Morning")){
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
            else if(batchtime.equals("Evening")){
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }
            else{
                System.out.println("Invalid time");
            }
        }
        else if(batch.equals("EU")){
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        }
        else{
            System.out.println("Invalid batch");
        }



    }
}
