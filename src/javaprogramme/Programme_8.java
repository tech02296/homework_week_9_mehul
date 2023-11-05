package javaprogramme;
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)
 */

import java.util.HashSet;
import java.util.Set;

public class Programme_8 {
    public static void main(String[] args) {
        Programme_8 p = new Programme_8();
        p.Store();
    }

    public void Store() {
        // syntax for setvalue
        Set<Integer> obj = new HashSet<>();
        obj.add(4);
        obj.add(7);
        obj.add(8);

        // if number between 1 to 10
        // using for loop
        for (int i = 1; i < 11; i++) {
            if (obj.contains(i)) {
                System.out.println(i + " :number is in a list ");
            } else {
                System.out.println(i + " :number is not in a list ");

            }

        }
    }
}
