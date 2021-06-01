package day43_list_custom_classes;

import officehours.practice_03_30_2021.PrefixAgain;

// firstName , age
public class Person {

    // data variable
    String firstName ;  // variable but no value
    int age ;
    char gender;

    // behaviour --> method
    public void speak(){
        System.out.println("person is speaking");
    }

}
class People {
    public static void main(String[] args) {  // class for running with main

        // create object of person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);  // Bob
        System.out.println(person1.age);  // 33
        System.out.println(person1.gender);  // M

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2. age = 22;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);  // Mike
        System.out.println(person2.age);   // 22
        System.out.println(person2.gender);  // M





    }
}
