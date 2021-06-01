package day47_constructors;

public class Student {

    private String name;
    private int age;

    // no_args constructor

    public Student(){

        System.out.println("No_args constructor");
    }

    // constructor with 1 param : String name
    public Student(String name){
        System.out.println("Name param constructor | name = " + name);

    }

    // constructor with age
    public Student(int age){
        System.out.println("age param constructor | age = " + age);
    }

    // constructor with name age
    public Student(String name, int age){
        System.out.println("name_age param constructor | name_age = " + name + age);

    }
}
