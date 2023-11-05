package javaprogramme;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

public class Programme_2 {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);// scanner calling
        System.out.print("\n Enter student name \t\t:\t");
        String name = scanner.nextLine();//defined for user enter name
        System.out.println("Enter student Roll number\t\t:\t");
        int rollnumber = scanner.nextInt();//defined for user enter roll number
        System.out.println("Enter Maths marks \t\t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) { // condition applied
            System.out.println("\nInvalid input,Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt(); // defined for user enter marks

        }

        System.out.println("Enter Science marks  \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) { // condition applied
            System.out.println("\nInvalid input,Marks should between 0 to 100");
            System.out.println("\nPlease Entre correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();


        }
        System.out.println("Enter English marks \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) { // condition applied
            System.out.println("\nInvalid input,Marks should between 0 to 100");
            System.out.println("\nPlease Enter coorect marks \t\t:\t");
            englishMarks = scanner.nextInt();

        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollnumber, scienceMarks, englishMarks, total, percentage, result, grade);
        //closing scanner
        scanner.close();
    }

    private static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        return null;
    }

    // calculate the sum
    public static int sum(int a, int b, int c) {
        return a + b + c; // return value

    }

    // calculate the result on subjects marks

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) { // if condition
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) { // else if condition
                grade = "A";

            } else if (percentage >= 50) {
                grade = "B";

            } else if (percentage >= 35) {
                grade = "C";

            } else {
                grade = "_";

            }
        }
        return grade;

    }
    // marks sheet printing


    public static void printTheMarkSheet(String name, int rollnumber, int mathsMarks, int scienceMarks, int englishMarks, double percentage, String result, String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        String rollNum = null;
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        String total = null;
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}




