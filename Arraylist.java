
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        num.add(40);
        num.add(2);
        num.add(45);
        num.add(38);
        num.add(3, 20);
        Collections.sort(num);// sorting command for ArrayList
        for (int x : num) {
            System.out.print(" " + x);
        }
        System.out.println("\n" + num.size());
        Collections.sort(num, Collections.reverseOrder());//reverse the num ArrayList
        num.remove(2);
        // num.clear();ArrayList clear
        // bool b=num.isEmpty();
        // bool c=num.contains(20);
        // int y=num.indexof(2);
        // num.set(4, 50);
        // int u = num.get(3);
        Iterator itr = num.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        System.out.println();
        num1.addAll(num);
        for (int w : num1) {
            System.out.print(" " + w);
        }
        System.out.println();
        System.err.println(num1.equals(num));
    }
}
