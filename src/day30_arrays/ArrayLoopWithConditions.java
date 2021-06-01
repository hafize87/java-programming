package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};

        for(double eachNum : prices){
            if(eachNum > 100.0){
                System.out.print(eachNum + " ");
            }
        }
        System.out.println("\n ---- prices between 10-70------");

        for(double i : prices){
            if(i >= 10 && i <= 70){
                System.out.println(i + " ");
            }
        }
        System.out.println();

        int count =0;
        for(double x : prices){
            if(x > 50) {
                count++;
            }
        }
        System.out.println("count = " + count);


        for(String str : countries){
            if(str.length() >= 7){
                System.out.print(str + " - " + str.length() + " ");
            }
        }



    }


}
