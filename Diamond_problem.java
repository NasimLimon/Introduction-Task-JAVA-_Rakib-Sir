public class Diamond_problem {
    public static interface A {

        default void fun() {
            System.out.println("Hello A");

        }

    }

    public static interface B {
        default void fun() {
            System.out.println("Hello B");

        }

    }

    public static class C implements A, B {

        public  void fun() {
            A.super.fun();
            B.super.fun();
            System.out.println("Hello");
        }

    }

    public static class Test {
        public static void main(String[] args) {
            C a1 = new C();
            a1.fun();
        }
    }
}
