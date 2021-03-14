import java.security.Principal;
import java.util.Random;

import javax.naming.ldap.Rdn;

public class App {
  public static void main(String[] args) {
    // Human n = new Human();
    // n.fillUp();
    // n.show();

    // Student n = new Student();
    // n.fillUp();
    // n.show();

    // Student a = new Student("Simon", "Hryszko", "Jarosław", 24, sex.cisgender,
    // "97022202222", 4, 37198);
    // a.show();

    // System.out.println("Comparring object by class Student and Human");

    // Human b = new Human("Simon", "Hryszko", "Jarosław", 24, sex.cisgender,
    // "97022202222");
    // Human c = new Human("Albert", "Einstein", "Ulm", 76, sex.cisgender,
    // "13486318645132");

    // System.out.println(a.equals(b) ? "a==b" : "a!=b");
    // System.out.println(b.equals(c) ? "b==c" : "b!=c");

    // Worker d = new Worker("Mark", "Smitch", "Jarosław", 48, sex.transgender,
    // "15022202222", "Dr", "Teacher", 123);
    // Human e = new Human("Simon", "Hryszko", "Jarosław", 24, sex.cisgender,
    // "15022202222");

    // System.out.println(b.equals(d) ? "b==d" : "b!=d");
    // System.out.println(e.equals(d) ? "e==d" : "e!=d");

    // =-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-=

    // Object o;
    // Random generator = new Random();
    // int rand = generator.nextInt(3);

    // switch (rand) {
    // case 0:
    // o = new Human("Simon", "Hryszko", "Jarosław", 24, sex.cisgender,
    // "15022202222");
    // break;
    // case 1:
    // o = new Worker("Mark", "Smitch", "Jarosław", 48, sex.transgender,
    // "15022202222", "Dr", "Teacher", 123);
    // break;
    // default:
    // o = new Student("Simon", "Hryszko", "Jarosław", 24, sex.cisgender,
    // "97022202222", 4, 37198);
    // break;
    // }//sqwitch

    // ((console)o).show();
    // =-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-=0

    Student f = new Student("Simon", "Hryszko", "Jarosław", 24, sex.cisgender, "97022202222", 3, 37198);
    Student g = new Student("Simon", "Hryszko", "Jarosław", 24, sex.cisgender, "97022202222", 4, 37198);
    Student h = new Student("Simon", "Hryszko", "Jarosław", 24, sex.cisgender, "97022202222", 3, 37198);

    System.out.println("f -> g = " + ((Comparable) f).compareTo(g));
    System.out.println("g -> f = " + ((Comparable) g).compareTo(f));
    System.out.println("h -> f = " + ((Comparable) h).compareTo(f));

  }
}