public class MethodOverloading {
    public static class Teacher {
        String name;
        String gender;
        int phone;

        void add(int a, int b) {
            System.out.println(a + b);
        }

        void add(double a, double b) {
            System.out.println(a + b);
        }

        void add() {
            System.out.println("NO Value");
        }
    }

    public static class test {
        public static void main(String[] args) {
            Teacher xx = new Teacher();
            xx.add();
            xx.add(5, 7);
            xx.add(2.3, 5.1);
        }
    }
}
