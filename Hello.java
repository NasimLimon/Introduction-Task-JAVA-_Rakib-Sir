
public class Hello {
    public static void main(String[] args) {
        int limon = 2 + 3;
        float x = 3.1416f;
        float area;
        area = .5f * 3.3f * 4;
        char s = 'L';
        boolean flag = true;
        // string x = "Nasim";
        // x.toUpperCase();
        // x.toLowerCase();
        // x.indexOf('s');
        int m = 45;
        int y = 12;
        int re = Math.abs(-3);
        System.out.println(Math.random());
        System.out.println(re);
        double fd = Math.sqrt(120);
        System.out.println(fd);
        int xx = Math.max(m, y);
        System.out.println(xx);
        System.out.print(limon);
        System.out.print("\n");
        System.out.print(s);
        System.out.print("\n");
        System.out.print(area);
        System.out.print("\n");
        System.out.print(x);
        System.out.print("\n");
        System.out.print(flag);
        System.out.print("\n");
        // if...else codition same as c++
        // if..else ternary operator same as c++
        // switch operator same as c++
        // while loop same as c++
        // do...while same as c++
        // for loop same as c++
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }
        int[] myNum = { 10, 20, 30, 40 };// array declareation
        System.out.println(myNum.length);
        // break and continue statement same as c++
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        System.out.println(myNumbers.length);

    }
}