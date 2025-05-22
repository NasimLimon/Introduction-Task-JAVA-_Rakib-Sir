class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}

class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public void displayInstructorInfo() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}

class Course {
    private int id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + id);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisite: " + prerequisite);
    }
}

class CourseOffering {
    private int studentId;
    private int instructorId;
    private int courseId;
    private String time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(int studentId, int instructorId, int courseId, String time, int sectionNo, int roomId, int year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public void displayCourseOffering() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Course ID: " + courseId);
        System.out.println("Time: " + time);
        System.out.println("Section No: " + sectionNo);
        System.out.println("Room ID: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", "Software Engineering");
        Instructor instructor1 = new Instructor(101, "Dr. John", "Computer Science", "Professor");
        Course course1 = new Course(201, "OOP Syllabus", "Object-Oriented Programming", "3", "Basic Programming");
        CourseOffering offering1 = new CourseOffering(1, 101, 201, "2025-05-07", 1, 102, 2025, "SP");

        student1.displayStudentInfo();
        instructor1.displayInstructorInfo();
        course1.displayCourseInfo();
        offering1.displayCourseOffering();
    }
}

