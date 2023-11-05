package javaprogramme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

public class Programme_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner applied
        System.out.println("Enter the first fruit name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter the second fruit name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter the thired fruit name: ");
        String name3 = scanner.nextLine();
        Programme_5 x = new Programme_5();// object created
        x.method(name1, name2, name3); // method calling through scanner
        scanner.close();// scanner close
    }

    public void method(String name1, String name2, String name3) {
        // create an ArraysList
        ArrayList<String> list = new ArrayList<>();

        // adding some elements

        list.add(name1);
        list.add(name2);
        list.add(name3);

        // create iterator

        Iterator<String> iterator = list.iterator();

        // iterator using

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);


        }


    }
}