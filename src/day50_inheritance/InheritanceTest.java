package day50_inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "Mike";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");


        Teacher t1 = new Teacher();

        t1.name = "Ali";
        t1.age = 55;
        t1.teacherID = 23445;
        t1.talk();
        t1.walk();
        t1.teach("java");

        Student student = new Student();

        student.name = "Veli";
        student.age = 34;
        student.school = "Sonoran Schools";
        student.study("java");



    }
}
