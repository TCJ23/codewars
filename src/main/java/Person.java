import java.util.Scanner;
 /* Constraints

 Test cases 1 >= T <= 4
  -5 > = age <= 30

        =================================
        Sample Input

        4
        -1
        10
        16
        18
        =================================
        Sample Output

        Age is not valid, setting age to 0.
        You are young.
        You are young.

        You are young.
        You are a teenager.

        You are a teenager.
        You are old.

        You are old.
        You are old.
        */
public class Person {

    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else this.age = initialAge;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
//        System.out.println(age<13 ? "You are young." : age<18 ? "You are a teenager." : "You are old." );
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
