public class TestStudent {

    public static void main(String[] args) {


        student a = new student("Allan");
        student b = new student("Mads");


        course basic = new course("Basic Programming");
        course advanced = new course("advanced Programming");


        a.addCourse(basic);
        b.addCourse(advanced);

        System.out.println(a);
        System.out.println(b);



    }




}
