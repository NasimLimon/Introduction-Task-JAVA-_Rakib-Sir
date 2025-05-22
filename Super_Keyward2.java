public class Super_Keyward2 {
    public static class Vehicle {
        String color;
        int weight;

        Vehicle(String c, int w) {
            color = c;
            weight = w;
        }

        void display() {
            System.out.println("Color:" + color);
            System.out.println("Weight:" + weight);
        }
    }

    public static class Car extends Vehicle {
        int gear;

        Car(String cc, int ww, int g) {
            super(cc, ww);
            gear = g;
        }

        void display() {
            super.display();
            System.out.println("Gear:" + gear);

        }
    }

    public static class Test {
        public static void main(String[] args) {
            Car fst = new Car("white", 370, 3);
            fst.display();

        }
    }
}
