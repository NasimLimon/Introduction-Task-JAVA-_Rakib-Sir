public class Super_Keyward {
    public static class A {
        int x = 10;

        void display() {
            System.out.println(x);
        }

        A() {
            System.out.println("Inside A");
        }
    }

    public static class B extends A {
        int x = 5;

        void display() {
            super.display();
            System.out.println(x);
        }

        void display2() {
            System.out.println(super.x);
        }

        B() {
            // super();
            System.out.println(" Inside B");
        }

    }

    public static class Test {
        public static void main(String[] args) {
            B fst = new B();
            fst.display();
            fst.display2();

        }
    }
}
