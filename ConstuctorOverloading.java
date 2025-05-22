public class ConstuctorOverloading {
    public static class Teacher {
        String name;
        String gender;
        int Phone;

        Teacher() {
            System.out.println("NO INfo");
        }

        Teacher(String n, String m, int p) {
            name = n;
            gender = m;
            Phone = p;
        }

        Teacher(String n, String m) {
            name = n;
            gender = m;
        }

        void displayInfo() {
            System.out.println(name);
            System.out.println(gender);
            System.out.println(Phone);
            System.out.print("\n");
        }
    }

    public class test {

        public static void main(String[] args) {
            Teacher teacher1 = new Teacher();
            Teacher teacher2 = new Teacher("LIMON", "MALE", 67898);
            Teacher teacher3 = new Teacher("SAMI", "MALE");
            teacher1.displayInfo();
            teacher2.displayInfo();
            teacher3.displayInfo();
        }
    }
}
