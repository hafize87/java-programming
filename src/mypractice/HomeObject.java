package mypractice;

import java.util.Scanner;

public class HomeObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Home db = new Home(in.next(),in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

        db.setData(in.next());
        db.setYint(in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

    }
}
