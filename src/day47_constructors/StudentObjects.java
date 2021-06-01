package day47_constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student st1 = new Student();  // runs No_args constructor
        Student st2 = new Student();  // runs No_args constructor

        Student st3 = new Student("Smith");  // Name param constructor | name = Smith
        Student st4 = new Student("Hafize");  // Name param constructor | name = Hafize

        Student st5 = new Student("Hafize", 33);


    }
}
