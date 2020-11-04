public class Lesson2 {
    public static void main(String[] args) {
        //Nameing, variable names are case sensitive
        //Below are different variables
        int age;
        int Age;
        int agE;
        //They can start with $ and _
        int $x = 10;
        int _b = 4;
        System.out.println($x);

        //"camel case"
        String fullName = "Tatevik Chibukhchyan";
        String full_name = "Tatevik Chibukhchyan";
        System.out.println(fullName);

        //Operations
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

        x = 4;
        y = 7;
        z = x++ - --y;
        System.out.println(z--);
        System.out.println(++x);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        boolean b = x == 5;
        System.out.println(b);

        //Arrays
        int[] fortest = new int[7];
        fortest[5] = 89;
        System.out.println(fortest[5]);
        int l = 8;

        //If-else statement
        //it same as t = k >0 ? 0 : 1;
        int t;
        if (k > 0) {
            t = 0;
        } else {
            t = 1;
        }
        System.out.println(t);

        //Switch statement
        switch (x) {
            case 6:
                System.out.println("x = 6");
                break;
            case 5:
                System.out.println("x = 5");
                break;
            default:
                System.out.println("x = 4");
                break;


        }

    }
}
