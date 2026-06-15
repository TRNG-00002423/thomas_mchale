
/** Lab 2 driver — run after Student is implemented. */

public class StudentDemo {
    public static void main(String[] args) {
        // create 3 Student instances, print enrollment count,
        // demonstrate equals vs == with two references to same id scenario if possible
        Student s1 = new Student("Jim","pro1");
        Student s2 = new Student("Mark", "pro2");
        Student s3 = new Student("Barry", "pro3");

        System.out.println(s1 == s1);
        System.out.println(s1.equals(s1));
        System.out.println(Student.getEnrollmentCount());
    }
}