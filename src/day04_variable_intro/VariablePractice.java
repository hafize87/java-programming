package day04_variable_intro;

public class VariablePractice {
    public static void main(String[] args) {
        //declare variable students that stores number
       int students ; // declare ONCE
       students = 50; // assign 50
        System.out.println(students); //50
        System.out.println(students); //50

        students = 70;  //assign 70
        System.out.println(students); //70

        students = 111;  //assign 111
        students = 125;    // assign 125
        System.out.println(students);    //125

        int teacher;
        teacher = 2;
        int mentors;
        mentors = 25;
        System.out.print("Number of teacher: ");  //Number of teacher: 2
        System.out.println(teacher);
        System.out.print("Number of mentor: ");  //Number of mentor: 25
        System.out.println(mentors);


    }
}
