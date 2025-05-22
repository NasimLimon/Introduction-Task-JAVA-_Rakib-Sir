class count {
    private static  int num = 0;

    public static void setccount() {
        num += 1;
    }

    public static int getdisplay() {
        return num;
    }
}

public class practiceStatic {
    public static void main(String[] args) {
        //count book = new count();
        count.setccount();
        count.setccount();
        count.setccount();


        int x = count.getdisplay();
        System.out.println(x);

    }
}
