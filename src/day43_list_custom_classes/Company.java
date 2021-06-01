package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee p1 = new Employee();
        p1.name = "John";
        p1.jobTitle = "SDET";
        p1.work();

//        System.out.println(p1.name);
//        System.out.println(p1.jobTitle);


        Employee p2 = new Employee();
        p2.name = "Sara";
        p2.jobTitle = "QA";
        p2.work();
//        System.out.println(p2.name);
//        System.out.println(p2.jobTitle);


        Employee p3 = new Employee();
        p3.name = "Alex";
        p3.jobTitle = "SM";
        p3.work();
//        System.out.println(p3.name);
//        System.out.println(p3.jobTitle);


    }
}
