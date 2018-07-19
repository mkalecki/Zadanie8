import java.util.Objects;
import java.util.Scanner;

public class Child {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Child (){
    Scanner scan = new Scanner(System.in);

            System.out.println("Podaj imię dziecka " );
            this.setFirstName(scan.nextLine());
            System.out.println("Podaj nazwisko dziecka ");
            this.setLastName(scan.nextLine());
            System.out.println("Podaj wiek dziecka " );
            this.setAge(scan.nextInt());

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", wiek:" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return age == child.age &&
                Objects.equals(firstName, child.firstName) &&
                Objects.equals(lastName, child.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, age);
    }
}
