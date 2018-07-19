import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Child[] children = new Child[5];

        children[0] = new Child();
        for (int i = 1; i < children.length; i++) {
            children[i] = new Child();
            for (int j = 0; j < i; j++) {
                while (children[i].equals(children[j])) {
                    System.out.println("istnieje już takie dziecko, wprowadź dane jeszcze raz");
                    children[i] = new Child();
                }
            }
        }

        System.out.println("Lista dzieci:");
        for (Child i : children) {
            System.out.println(i);
        }


    }
}
