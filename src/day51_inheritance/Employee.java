package day51_inheritance;

public class Employee {

    String jobTitle;


    public double calculateSalary(double hourlyRate){

        return 52 * 40 * hourlyRate * 1.1;
    }


    // toString method is inherited from object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
