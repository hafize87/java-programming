package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Wooden Spoon";

        if(onSale && freeShipping){
            System.out.println("Adding to cart - " + itemName);
    }
        else{
            System.out.println("Countinue shopping for good deals on - " + itemName);
        }

        // add to cart only when it is freeshipping, onsale and itemname is "wooden spoon"



        if(onSale && freeShipping && itemName.equals("Wooden Spoon")){
            System.out.println("Adding to cart - " + itemName);
        }
        else{
            System.out.println("Countinue shopping for good deals on - " + itemName);
        }

        //location , salary, remote, benefits
        String location = "Tucson" ;
         double salary = 75_000.0;
         boolean remote = false;
         boolean benefits = true;

         if(location.equals("Tucson") && salary >= 75000 && remote && benefits){
             System.out.println("I can accept the job");
         }
         else{
             System.out.println("Lets consider another offer or negotiate");
         }

}

}
