package cz.spsmb.b3;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hodnotu");
        int number = sc.nextInt();
        int counter = 0;
        int rest = 0;
        int [] array = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < array.length; i++) {
            counter = number/array[i];
            System.out.println(number + " = " + counter + " * " + array[i]);
            number = number%array[i];
        }

    }
}