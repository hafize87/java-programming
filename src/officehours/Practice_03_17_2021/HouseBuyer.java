package officehours.Practice_03_17_2021;

import java.util.Scanner;

public class HouseBuyer {
    public static void main(String[] args) {
        //                                  Switch tasks
//              [House Buyer ] - Look at CappuccinoBuyer from class for an idea
//
//        You are buying a new house and need to collect information about the houses in a specific area.
//        You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5),
//        if it is a gated community or not, allow pets or not.
//      Make variables for all of that information. Given empty defaults for all except the neighborhood name.
//      Print the information once at the end.
//                   Data based on neighborhood name:
//        name - Hills
//        average price - 89,000
//        rating - 4.0
//        gated - no
//        allow pets - yes
//
//        name - Oaks
//        average price - 75,000
//        rating - 3.5
//        gated - no
//        allow pets - yes
//
//        name - Highland
//        average price - 150,000
//        rating - 4.5
//        gated - yes
//        allow pets - no
//
//        name - Canyon
//        average price - 201,000
//        rating - 4.8
//        gated - yes
//        allow pets - yes


        Scanner input = new Scanner(System.in);
        System.out.println("Enter neighborhood name");
        String name = input.next();

       double averagePrice = 0;
       double rating =0;
       boolean gated = true;
       boolean allowPets = true;

       switch (name){
            case"Hills":
                averagePrice = 89000;
                rating =4.0;
                gated = true;
                allowPets = false;
                break;
           case"Oaks":
               averagePrice = 75000;
               rating =3.5;
               gated = false;
               allowPets = true;
               break;
           case"Highland":
               averagePrice = 150000;
               rating =4.5;
               gated = true;
               allowPets = false;
               break;
           case"Canyon":
               averagePrice = 201000;
               rating =4.8;
               gated = true;
               allowPets = true;
               break;
           default:
               System.out.println("Invalid name");
       }
        System.out.println("Name : " + name + " Price : " + averagePrice + " Rating : " + rating +
                " Gate : " + gated + " Pets : " + allowPets);

    }
}
