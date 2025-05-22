public class MethodOverRidding {
    public static class Person {
        String name;
        int age;

        void displayinformation() {
            System.out.println("Name :" + name);
            System.out.println("Age :" + age);
        }

    }

    public static class Teacher extends Person {
        String qualification;

        void displayInformation() {
             System.out.println("Name:" + name);
             System.out.println("Age:" + age);
            //or
            //super.displayinformation();
            System.out.println("Qualificatin:" + qualification);
        }
    }

    public class test {
        public static void main(String[] args) {
            Teacher t1 = new Teacher();
            t1.name = "Limon";
            t1.age = 22;
            t1.qualification = "BSC In SWE";
            t1.displayInformation();
            Person p1 = new Person();
            p1.name = "Sami";
            p1.age = 23;
            p1.displayinformation();
        }
    }

}