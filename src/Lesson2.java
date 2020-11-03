public class Lesson2 {
    public static void main(String[] args) {
        int x = 4, y = 6;
        System.out.println(x + y);
        System.out.println(x * y);
        int z = y / x;
        System.out.println(z);
        int k = y % x;
        System.out.println(k);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);

        // y = ++x;
        y = x++;
        System.out.println(y);
        //  ++x;
        // System.out.println(x);

        x=4;
        y=7;
        z=x++ - --y;
        System.out.println(z--);
        System.out.println(++x);
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("z = " +z);

        boolean b = x==5;
        System.out.println(b);


    }
}
