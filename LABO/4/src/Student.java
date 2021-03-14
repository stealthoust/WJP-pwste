public class Student extends Human implements console, Comparable{
  int term;
  int studentID;

  public int compareTo(Object o) {

    Student temp = (Student)o;

    return this.term - temp.term;
  }

  public Student(String firstName, String surname, String address, int age, sex gender, String governmentID, int term,
      int studentID) {
    super(firstName, surname, address, age, gender, governmentID);
    this.term = term;
    this.studentID = studentID;
  }

  public Student() {
  }

  public void fillUp() {
    super.fillUp();

    System.out.println("Filling up student's data!");
    this.term = validPositiveInt("Term", false);
    this.studentID = validPositiveInt("Student ID", false);
  }

  public void show() {
    System.out.println("=-==-==-==-==-==-==-==-=STUDENT-INFO=-==-==-==-==-==-==-==-=");
    super.show();
    System.out.println("Term: " + this.term);
    System.out.println("Student ID: " + this.studentID + "\n");
  }
}