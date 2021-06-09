package day51_inheritance;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.jobTitle = "java Developer";
        System.out.println( employee1.calculateSalary(55.0));
        double annualDevSalary = employee1.calculateSalary(55.0);
        System.out.println("Math.round(annualDevSalary) = " + Math.round(annualDevSalary));


        Contractor contractor1 = new Contractor();
        contractor1.jobTitle = "SDET";
        double salary = contractor1.calculateSalary(55);
        System.out.println("salary = " + salary);

        System.out.println(employee1.toString());
        System.out.println(contractor1);

    }




}
