public class This_Keyward {
    public static class Person {
        String name;
        int age;
        String hair;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person(String name, int age, String hair) {
            this(name, age);
            this.hair = hair;
        }

        void message() {
            System.out.println("I have a message");
        }

        void display() {
            this.message();
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("HairColor:" + hair);

        }
    }

    public static class Test {
        public static void main(String[] args) {
            Person p1 = new Person("Limon", 22);
            Person p2 = new Person("sami", 23, "pink");
            p1.display();
            p2.display();
        }
    }
}
