package LABO1;

import java.io.*;

public class LABO1 {

    //Funkcja obliczająca rekurencje
    private static long factorialR(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialR(n - 1);
        }
    }

    private static long factorialI(int n) {

        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    private static long powR(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return powR(a, n - 1) * a;
        }
    }

    private static long powI(int a, int n) {

        long result = 1;

        if (n > 0) {
            for (int i = n; i > 0; i--) {
                result *= a;
            }
        } else {
            a = -1;
        }
        return result;

    }

    private static int validInt(String text) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean goodData = false;
        int data = -1;

        while (!goodData) {
            try {
                System.out.print(text);

                data = Integer.parseInt(in.readLine());
                goodData = true;
            } catch (Exception e) {
                System.err.println("Error: this is not int! Try again!");
                goodData = false;
            }
        }
        return data;
    }

    //zero = true mean that zero is acceptabled
    public static int validPositiveInt(String text, boolean zeroAcceptabled) {

        boolean goodData = false;
        int result = -1;

        while (!goodData) {
            result = validInt(text);

            if (!zeroAcceptabled && result <= 0) {
                System.err.println("Error: this is not value greater than zero");
                goodData = false;
            } else if (zeroAcceptabled && result < 0) {
                System.err.println("Error: this is not value greater or equel zero");
                goodData = false;
            } else {
                goodData = true;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();

        //Factorial
        System.out.println("Let's calc factorial!");

        int n = validPositiveInt("n = ", true);
        System.out.println("R: " + n + "!=" + factorialR(n));
        System.out.println("I: " + n + "!=" + factorialI(n));

        //Power
        System.out.println("Let's make some power!");
        int a = validInt("a = ");
        int n2 = validPositiveInt("n = ", true);

        System.out.println("R: " + a + "^" + n + "=" + powR(a, n));
        System.out.println("I: " + a + "^" + n + "=" + powI(a, n));
    }
}
