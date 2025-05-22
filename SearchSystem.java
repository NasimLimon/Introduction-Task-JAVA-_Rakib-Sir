class Filter {
   public void filterProduct(String category) {
      System.out.println("category: " + category);
   }

   public void filterProduct(int doller1, int doller2) {
      System.out.println("PriceRange: " + doller1 + "to" + doller2);
   }

   public void filterProduct(String Brand, boolean x) {
      System.out.println("Brand: " + Brand);
   }

   public void filterProduct(String category, int doller1, int doller2) {
      System.out.println("category: " + category + " " + "PriceRange: " + doller1 + "to" + doller2);
   }

   public void filterProduct(String category, String brand, int doller1, int doller2) {
      System.out.println(
            "category: " + category + " " + "Brand: " + brand + " " + "PriceRange: " + doller1 + "to" + doller2);
   }

}

public class SearchSystem {
   public static void main(String[] args) {
      Filter prod1 = new Filter();
      prod1.filterProduct("fasion");
      Filter prod2 = new Filter();
      prod2.filterProduct(110,200);
      Filter prod3 = new Filter();
      prod3.filterProduct("Nike",false);
      
   }

}


