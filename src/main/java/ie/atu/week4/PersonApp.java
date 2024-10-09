package ie.atu.week4;

public class PersonApp {
    public static void main(String[] args){
        System.out.println("please enter your name");

        Person firstPerson = new Person();
        firstPerson.setName("Morgan");
        firstPerson.setEmail("morgan@atu.ie");
        firstPerson.setCourse("Electronics");
        System.out.println("Details of the first person is " + firstPerson.toString());

        //Second student

        Person secondPerson = new Person("Sean");

        //Third student

        Person thirdPerson= new Person("Mary", "mary@atu.ie", "Maths");
    }
}
