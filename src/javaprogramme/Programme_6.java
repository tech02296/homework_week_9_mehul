package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index)
 * from a given
 * array list
 */

public class Programme_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner applied
        System.out.println("Enter any digit from 0 to 5: ");
        int index = scanner.nextInt();
        Programme_6 z = new Programme_6();// object creation
        z.method(index); // method calling through object
        scanner.close(); // scanner close
    }

    public void method(int index) {
        // create an Array  list
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the arraylist

        list.add(" _ ");
        list.add("Good listener");
        list.add("willing to learn");
        list.add("Creative");
        list.add("Never give up");
        list.add("Faith in god");

        // retrieve an element at the specified index

        String element = list.get(index);

        // print the element
        System.out.println("Element at index" + index + "  : " + element);

    }
}
