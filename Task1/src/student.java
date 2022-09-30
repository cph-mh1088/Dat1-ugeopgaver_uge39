import java.util.ArrayList;
import java.util.Arrays;



public class student {

    private String name;

    private ArrayList<course> courses = new ArrayList<>();

    //constructor
    public student(String name) {
        this.name= name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    void addCourse(course c) {
    courses.add(c);




    }

}



/*
    //method toString
    public String toString()
    {
        return name + courses;
    }
*/