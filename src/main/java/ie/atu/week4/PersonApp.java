package ie.atu.week4;

public class PersonApp {
    public static void main(String[] args){
        System.out.println("Please enter your name");

        Student firstStudent = new Student();
        firstStudent.setName("Morgan");
        firstStudent.setEmail("morgan@atu.ie");
        firstStudent.setCourse("Electronics");
        System.out.println("" + firstStudent.toString());

        //Second student

        Student secondPerson = new Student();

        //Third student

        Student thirdPerson= new Student();
    }
}
