import java.io.*;

public class human {

  String firstName;
  String surname;
  String address;
  int age;
  sex gender;
  long givernmentID;

  public human(String fn, String s, String ad, int ag, sex g, long gID) {

    this.firstName = fn;
    this.surname = s;
    this.address = ad;
    this.age = ag;
    this.gender = g;
    this.givernmentID = gID;

  }

  public human() {
  }

  protected String getString(String label) {

    String result = "";
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    while (result.length() == 0) {

      System.out.print(label + ": ");

      try {
        result = in.readLine();
      } catch (IOException e) {
        result = "";
      }

      if (result.length() == 0)
        System.err.println("Something went wrong, try one more time!");
    }

    return result;
  }

  protected int validInt(String text) {
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

  // zero = true mean that zero is acceptabled
  protected int validPositiveInt(String text, boolean zeroAcceptabled) {

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

  public void fillUp() {

    this.firstName = getString("First name");
    this.surname = getString("Surname");

    String temp = "";

    while (temp == "") {
      System.out.println("What is your sex?");

      System.out.println("[M]ale");
      System.out.println("[F]emale");
      System.out.println("[T]ransgender");
      System.out.println("[C]isgender");
      System.out.println("[N]onBinary");
      System.out.println("[O]ther");

      temp = getString("sex");

      temp = temp.toLowerCase();
      if (temp.charAt(0) == 'm')
        this.gender = sex.male;
      else if (temp.charAt(0) == 'f')
        this.gender = sex.female;
      else if (temp.charAt(0) == 't')
        this.gender = sex.transgender;
      else if (temp.charAt(0) == 'c')
        this.gender = sex.cisgender;
      else if (temp.charAt(0) == 'n')
        this.gender = sex.nonBinary;
      else if (temp.charAt(0) == 'o')
        this.gender = sex.other;
      else {
        System.err.println("Wrong option! Try again..");
        temp = "";
      }
    }

    this.givernmentID = validPositiveInt("Government ID", false);

  }

  public void show() {
    System.out.println("First name: " + this.firstName);
    System.out.println("Surname: " + this.surname);
    System.out.println("Address: " + this.address);
    System.out.println("Age: " + this.age);
    System.out.println("Gender: " + this.gender);
    System.out.println("Givernment ID: " + this.givernmentID);
  }

  public static void main(String[] args) {
    human aasdasdada = new human();

    aasdasdada.fillUp();

  }

}