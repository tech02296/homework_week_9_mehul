package javaprogramme;
/*
 Write a Java program to reverse an array of integer values.
 */


import java.util.Arrays;

public class Programme_3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6}; // defined arrays
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));// statement print
    }
    public static void reverseArray(int [] arr){
        int start = 0; //
        int end = arr.length - 1;
        while (start<end){        // while loop
            int temp = arr [start];
            arr[start] = arr [end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
