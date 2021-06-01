package day38_methods;


public class RecursiveMethod {
    public static void main(String[] args) {

        print1to100(1);


    }
    public static void print1to100(int num){
        System.out.println(num + " ");
        num++;
        if(num <= 100){
            print1to100(num);
        }
    }

}
