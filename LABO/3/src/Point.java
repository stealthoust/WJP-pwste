import java.io.*;

public class Point {

    public double x, y, z;
    private String name;

    private static double validDouble(String text) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean goodData = false;
        double data = -1;

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

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = z;
        this.z = z;
        name = "";
    }

    public Point(double x, double y, double z, String name) {
        this.x = x;
        this.y = z;
        this.z = z;
        this.name = name;
    }

    public Point(String name) {
        this.name = name;
        makePoint();
    }

    private void makePoint() {
        System.out.println("Let's see where is point " + name + ": ");
        x = validDouble("x = ");
        y = validDouble("y = ");
        z = validDouble("z = ");
    }

    public void show() {
        System.out.println(name + " = ( " + x + "; " + y + "; " + z + " )");
    }

    public static void main(String[] args) throws Exception {
        Point A = new Point("A");
        Point B = new Point("B");

        Vector Va = new Vector(A, B, "Va");
        Vector Vb = new Vector(1, 1, 3, "Vb");

        Va.show();
        Vb.show();

        Vector Vc = Vector.sum(Va, Vb, "Vc");
        Vc.show();

        Vector Vd = Vector.sub(Va, Vb, "Vd");
        Vd.show();

        System.out.println(Vb.countLength());
    }
}
