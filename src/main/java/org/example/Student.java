package org.example;

public class Student {

    private Course course;

    public Student()
    {

    }
    /**Constructor Injection **/
    public Student(Course course)
    {
        this.course = course;
    }

    //To Remove The NullPointerException use Dependency Injection

    /** setter  injection : Use Setter Method**/
    public void setCourse(Course course) {
        this.course = course;
    }



    public void Study()
    {
        int start = course.enroll();
        if(start == 1)
        {
            System.out.println("Journey Stated");
        }
        else{
            System.out.println("Payment Failed");
        }
    }
}
