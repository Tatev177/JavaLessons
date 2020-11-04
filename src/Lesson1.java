public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello Java Lesson 1");
        System.out.println("2020");
        System.out.println("PicsArt");

        //Primitive types

        // byte (8 bit signed integer)
        byte a = -6;
        byte c = 127; //max value, min value -128
        System.out.println(a);
        System.out.println(c);

        //short (16 bit signed integer)
        short b = 32767; //max value(2^15), 2 times smaller than int type, min value -2^15
        System.out.println(b);

        //int (32 bit signed integer)
        int d = 1777777; //max value is 2^31-1, min value -2^31
        System.out.println(d);

        //long (64 bit signed integer)
        long e = -15000L; // max value 2^63-1, min value-2^63
        System.out.println(e);

        //float (single precision 32bit IEEE 754 floating point)
        float f = 77.3f;
        System.out.println(f);

        //double (double precision 64bit IEEE 754 floating point)
        double g = 96.3697;
        System.out.println(g);

        //boolean (one bit information, true or false)
        boolean x = true;
        boolean y = false;
        System.out.print(x);
        System.out.println(y);

        //char (single 16bit Unicode Character)
        char forContinuePleaseChoose_Y_or_N = 'Y';
        System.out.print("forContinuePleaseChoose_Y_or_N ");
        System.out.println(forContinuePleaseChoose_Y_or_N);

        //String
        String name = "Hello";
        System.out.print(name + " " + "dear," + " "
        + "how are you?");

    }
}
