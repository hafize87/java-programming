package day48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

public class GroupObjets {

    public static void main(String[] args) {

      //  Scanner scan = new Scanner()  Scanner class basta argument ile yazildigi icin ve bos constructor yazilmadigi icn bosu kabul etmiyo

        Group group1 = new Group("Cybertek");  // dependency injection. group object creation depends on String name

        // print size of members

        System.out.println(group1.getMembers().size());
        group1.addMember("Hafize");
        group1.addMember("Busra");
        group1.addMember("Sabina");
        group1.addMember("Kiril");
        group1.addMember("Aigerim");
        group1.addMember("Angela");
        group1.addMember("Nurittin");
        group1.addMember("Sarah");

        // 2 yol
   //     group1.setMembers(Arrays.asList("Max","Mykola","Nasiba","Ilyas","Zafar","Meleha","Kamala","Rita","Kanymgul"));


        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());



        Group group2 = new Group("Cyber Ladies");

        group2.setMembers(Arrays.asList("Max","Mykola","Nasiba","Ilyas","Zafar","Meleha","Kamala"));

        // print all members. not toString
        System.out.println(group2.getMembers());

        // Nasiba is in group or no

       if (group2.getMembers().contains("Nasiba")){
           System.out.println("Nasiba is a member of group2");
        }
       else{
           System.out.println("Nasiba is NOT a member of group2");
       }

       // remove some member from group1

        group1.removeMember("Kiril");
        group1.removeMember("Sabina");

        System.out.println(group1.getMembers());




    }
}
