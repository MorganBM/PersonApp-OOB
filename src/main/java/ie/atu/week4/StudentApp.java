package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        //Prompting for the details of student
        String[]details1=getDetails();
        //populates using the array from the function
        Student firstStudent = new Student();
        firstStudent.setName(details1[0]);
        firstStudent.setEmail(details1[1]);
        firstStudent.setCourse(details1[2]);

        //Second Student
        String[]details2=getDetails();
        //I know that name so I set it already
        Student secondStudent = new Student("Eoin", details2[1], details2[2]);

        //Third student
        Student thirdStudent= new Student("Donald", "donal@atu.ie", "Game art and animation");
        System.out.println("" + firstStudent);
        System.out.println("" + secondStudent);
        System.out.println("" + thirdStudent);
    }
    public static String[] getDetails()
    {
        //Prompting for details
        String[]details=new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the student ");
        details[0] = sc.nextLine();
        System.out.println("Please enter the email of the student ");
        details[1]  = sc.nextLine();
        System.out.println("Please enter the course of the student ");
        details[2]  = sc.nextLine();
        return details;
    }
}
//WORKS