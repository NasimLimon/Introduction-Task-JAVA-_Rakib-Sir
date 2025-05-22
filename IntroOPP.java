public class IntroOPP {
    // create object
    public static class Teacher {
        String name, gender;
        String phoneNum;

        // create constructor
        Teacher() {
            System.out.println("LIMON");
        }

        Teacher(String n, String m, String ph) {
            name = n;
            gender = m;
            phoneNum = ph;
        }
        // method creation

        void setInfo(String n, String m, String ph) {
            name = n;
            gender = m;
            phoneNum = ph;
        }

        // method creation
        void displayInfo() {
            System.out.println(name);
            System.out.println(gender);
            System.out.println(phoneNum);
            System.out.println("\n");
        }

        // method return value
        int multiple(int value) {
            return value * value;
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Teacher teacher1 = new Teacher();

            Teacher teacher2 = new Teacher();
            Teacher teacher3 = new Teacher();
            Teacher teacher4 = new Teacher("kdhh", "male", "67890");

            teacher1.phoneNum = "1723";
            teacher1.gender = "MAle";
            teacher1.name = "Limon";
            teacher2.name = "Sami";
            teacher2.gender = "Male";
            teacher2.phoneNum = "23456";
            teacher3.setInfo("Nazu", "Male", "98765");

            teacher1.displayInfo();
            teacher2.displayInfo();
            teacher3.displayInfo();
            teacher4.displayInfo();
            Teacher result = new Teacher();
            int resu = result.multiple(5);
            // System.out.println(result.multiple(6));
            System.out.println(resu);

        }
    }

}
