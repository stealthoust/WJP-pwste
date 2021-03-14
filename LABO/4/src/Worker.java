public class Worker extends Human implements console {
  String degree;
  String position;
  Integer salary;

  public Worker(String firstName, String surname, String address, int age, sex gender, String governmentID,
      String degree, String position, int salary) {
    super(firstName, surname, address, age, gender, governmentID);

    this.degree = degree;
    this.position = position;
    this.salary = salary;
  }

  public void fillUp() {
    super.fillUp();

    System.out.println("Filling up worker's data!");
    this.degree = getString("Degree");
    this.position = getString("Position");
    this.salary = validPositiveInt("Salary", false);
  }

  public void show() {
    System.out.println("=-==-==-==-==-==-==-==-=WORKER-INFO=-==-==-==-==-==-==-==-=");
    super.show();
    System.out.println("Degree: " + this.degree);
    System.out.println("Position: " + this.position);
    System.out.println("Salary: " + this.salary);

  }

}