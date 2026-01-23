public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jane", "B001");
        Student student2 = new Student("John", "B002");

        Course course = new Course("MSc Software Development");

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        course.printEnrolledStudents();
    }
}
  
