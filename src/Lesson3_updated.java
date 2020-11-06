public class Lesson3_updated {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task1: Create an array and fill it with 2 number");
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 2;
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task2: Create an array and fill it with numbers from 1:1000");
        int[] array2 = new int[1000];
        for (int i = 0, j = 1; i < array2.length; i++, j++) {
            array2[i] = j;
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task3: Create an array and fill it with odd numbers from -20:20");
        int[] array3 = new int[41];
        for (int i = 0, j = -19; i < array3.length / 2; i++, j += 2) {
            array3[i] = j;
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task4: Create an array and fill it. Print all elements which can be divided by 5. ");
        int[] array4 = {10, 6, 17, 55, 71, 125, 3, 7, 8};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task5: Create an array and fill it. Print all elements which are between 24.12 and 467.23 .");
        double[] array5 = {25.3, 24, 7, 37, 7, 967, 5888, 47.3, 388.3, 77.7};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > 24.12 &&  array5[i]< 467.23) {
                System.out.print(array5[i] + " ");
            }
        }

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task6: Create an array and fill it. Print count of elements which can divided by 2.");
        int[] array6 = {5,10,7,33,4,822,7692,48,11,7,878};
        int s = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] % 2 == 0) {
                s++;
            }
        }
        System.out.print(s + " ");

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task7: Given an integer, 0<N<21, print its first 10 multiples. Each multiple N x i (0<i<11) should be printed on a new line in the form: N x i = result.");

        int t = 0;
        for (int i = 0; i <= 21; i++) {
            for (int j = 1; j < 11; j++) {
                t = i * j;
                System.out.println(i + "x" + j + "=" + t);
            }

        }
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Additional task");
        //////erkvoryakneri xndir, gtnum enq en tivy vory zuyg chuni, XOR-ov
        int[] ar = {46, 4, 7, 46, 7};
        int g = 0;
        for (int i = 0; i < ar.length; i++) {
            g = g ^ ar[i];
        }
        System.out.println(g);

    }
}

