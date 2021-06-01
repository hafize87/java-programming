package day32_arrays_split;

public class AWSZone {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("----starting deployment of etsy app to AWS zones........ ");

        String [] arrayZone = zones.split(",");

        for(String each : arrayZone){
            //System.out.println(each);
            System.out.println("deploying ["+app+"] to " + each + " ...");
            System.out.println("deployment completed for " + each + " ...");
        }
        System.out.println("-- all deployments completed ---");
    }
}
