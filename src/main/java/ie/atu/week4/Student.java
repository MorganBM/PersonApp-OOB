package ie.atu.week4;

public class Student {
    private String name;
    private String email;
    private String course;

    public Student(){
        this.name = "";
        this.email = "";
        this.course= "";

    }
//grab value of name
    public Student(String name) {
        this.name = name;
        this.email = "";
        this.course = "";
    }

    //grabs value of name, email and course
    //this all means that
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }



    //providing access methods below

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student details: " +
                "Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Course='" + course + '\'' +
                '}';
    }
}



