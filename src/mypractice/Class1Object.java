package mypractice;

import java.util.Scanner;

public class Class1Object {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Class1 person = new Class1();
        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        Class1 person2 = new Class1(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2.toString());


    }
}
