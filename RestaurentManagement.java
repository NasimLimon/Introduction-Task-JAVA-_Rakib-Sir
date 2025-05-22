abstract class Restaurent {

    abstract double calculateTotalBill();

    abstract int estimateDeliveryTime();
}

class FastFood extends Restaurent {
    private int bill;

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public double calculateTotalBill() {
        return bill + (bill * 0.10);  // 10% tax
    }

    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}

class FineDine extends Restaurent {
    private int bill;

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public double calculateTotalBill() {
        return bill + (bill * 0.15);  // 15% tax
    }

    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}

public class RestaurentManagement {
    public static void main(String[] args) {
        FastFood fastFood = new FastFood();
        FineDine fineDine = new FineDine();

        fastFood.setBill(100);
        fineDine.setBill(200);

        System.out.println("Fast Food Total Bill: $" + fastFood.calculateTotalBill());
        System.out.println("Fast Food Delivery Time: " + fastFood.estimateDeliveryTime() + " mins");

        System.out.println("Fine Dine Total Bill: $" + fineDine.calculateTotalBill());
        System.out.println("Fine Dine Delivery Time: " + fineDine.estimateDeliveryTime() + " mins");
    }
}
