import java.io.*;

public class Vector {
  String name;
  public double x, y, z;

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

  public Vector(double x, double y, double z, String name) {
    this.x = x;
    this.y = y;
    this.z = z;

    this.name = name;
  }

  public Vector(Point S, Point B, String name) {
    this.x = B.x - S.x;
    this.y = B.y - S.y;
    this.z = B.z - S.z;

    this.name = name;
  }

  public Vector(String name) {
    this.x = 0;
    this.y = 0;
    this.z = 0;

    this.name = name;
  }

  private void sum(Vector A, Vector B) {
    this.x += B.x;
    this.y += B.y;
    this.z += B.z;
  }

  private void sub(Vector A, Vector B) {
    this.x -= B.x;
    this.y -= B.y;
    this.z -= B.z;
  }

  public void makeVector() {
    System.out.println("Let's see our vector..");
    this.x = validDouble("x = ");
    this.y = validDouble("y = ");
    this.z = validDouble("z = ");
  }

  public void show() {
    System.out.println(this.name + " = ( " + this.x + "; " + this.y + "; " + this.z + " )");
  }

  public static Vector sum(Vector A, Vector B, String name) {
    A.sum(A, B);

    return A;
  }

  public static Vector sub(Vector A, Vector B, String name) {
    A.sub(A, B);

    return A;
  }

  public double countLength() {
    double tmp = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    double result = Math.sqrt(Math.pow(tmp, 2) + Math.pow(this.z, 2));

    return result;
  }
}
