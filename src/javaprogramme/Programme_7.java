package javaprogramme;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

public class Programme_7 {
    public static void main(String[] args) {
        Programme_7 p = new Programme_7();
        p.method();

    }
    public boolean method() {
        ArrayList<String> list = new ArrayList<String>();
        // adding value in the list

        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Blue");
        list.add("Black");
        list.add("Yellow");
        list.add("Orange");

        // check if the list is empty
        // if else condition applied

        if(list.isEmpty()) {
            System.out.println("The ArraysList is empty: ");
            return true;
        }else{
            System.out.println("The ArraysList is not empty: ");
            return false;

        }
    }
}
