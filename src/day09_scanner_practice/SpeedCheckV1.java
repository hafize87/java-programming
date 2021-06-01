package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {

        int speedLimit = 45;
        int currentSpeed = 50;
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow down!");
    }
}
