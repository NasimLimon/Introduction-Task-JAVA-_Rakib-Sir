public class Inheritence {
    public static class Person {
        String name;
        int age;

        void displayInformation1() {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
        }
    }

    public static class Teacher extends Person {
        String qualification;

        void displayInformation2() {
            displayInformation1();
            System.out.println("Qualification:" + qualification);
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Teacher t1 = new Teacher();
            t1.name = "Nasim";
            t1.age = 12;
            t1.qualification = "BSC IN CSE";
            t1.displayInformation2();
            Teacher t2 = new Teacher();
            t2.name = "Sheikh";
            t2.age = 33;
            t2.displayInformation1();
        }
    }
}
