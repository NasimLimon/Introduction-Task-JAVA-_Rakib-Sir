public class Java_Practice {
    public static class Car {
        String owner;
        String brand;
        int serialNo;
        int gear;

        Car(String owner, String brand, int serialNo) {
            this.owner = owner;
            this.brand = brand;
            this.serialNo = serialNo;

        }

        Car(String owner, String brand, int serialNo, int gear) {
            this(owner, brand, serialNo);
            this.gear = gear;
        }

        void display() {
            System.out.println("Owner:" + owner);
            System.out.println("Brand:" + brand);
            System.out.println("Serial:" + serialNo);
            System.out.println("Gear:" + gear);

        }

    }

    public static class Motor extends Car {
        String fuel;

        Motor(String owner, String brand, int serialNo, int gear, String fuel) {
            super(owner, brand, serialNo, gear);
            this.fuel = fuel;
        }

        // OverRiding
        void display() {
            super.display();
            System.out.println("Fuel:" + fuel);

        }
    }

    public static class Test {
        public static void main(String[] args) {
            Motor honda = new Motor("Limon", "Honda", 12, 5, "Full");
            honda.display();

        }
    }
}
