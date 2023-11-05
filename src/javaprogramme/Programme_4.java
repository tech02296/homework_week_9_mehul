package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list,
 * add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//calling scanner
        System.out.println("Enter colours name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the first colours name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter the second colours name: ");
        String name2 = scanner.nextLine();
        Programme_4 obj = new Programme_4(); // method object by object
        obj.colours(name, name1, name2);
        scanner.close();//scanner close

    }

    public void colours(String name, String name1, String name2) {
        // Arrays list for the colours
        ArrayList<String> colours = new ArrayList<String>();

        // add some colours list in arrays
        colours.add(name);
        colours.add(name1);
        colours.add(name2);

        // using for-each loop
        for (String colour : colours) {
            System.out.println(colour);
        }
    }
}
