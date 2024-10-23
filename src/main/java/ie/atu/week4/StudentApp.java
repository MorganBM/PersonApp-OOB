package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        System.out.println("Please enter your name, email and course");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String email = sc.nextLine();
        String course = sc.nextLine();

        Student firstStudent = new Student();
        firstStudent.setName(name);
        firstStudent.setEmail(email);
        firstStudent.setCourse(course);



     /*   firstStudent.setName("Morgan");
        firstStudent.setEmail("morgan@atu.ie");
        firstStudent.setCourse("Electronics");
        System.out.println("" + firstStudent.toString());

      */
        //Second student
        /*
        for(int x=0; x<10; x++) {
            System.out.println("" + firstStudent.toString());
        }

        Student secondPerson = new Student();

        //Third student

        Student thirdPerson= new Student();

         */
    }
}

