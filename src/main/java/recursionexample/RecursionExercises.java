package recursionexample;

import java.util.Arrays;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    public static long factorialRecursive(int n) {
        // TODO: implement Task 1
        if(n < 0){
            throw new IllegalArgumentException();
        }
        //Bases cases (factorialRecursive(0) == 1 or factorialRecursive(1) == 1)
        if(n == 0 || n == 1){
            return 1;
        }
            return n * factorialRecursive(n-1); //recursive case
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        // TODO: implement Task 2
        if(n < 0){
            throw new IllegalArgumentException();
        }
        long result = 1;
        //For loop to do the recursive part
        for(int i = 2; i <= n; i++){
            result = result * i; //Multiples by the next number until it reaches n
        }
        return result;

    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        if(n < 0){
            throw new IllegalArgumentException();
        }
        //base cases
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2); //recursive case
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        if(data == null) {
            throw new IllegalArgumentException();
        }
        //base cases
        if(data.length == 0){
            return 0;
        }
        return sumArrayFromIndex(data, 0); //recursive case

    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        if(index == data.length) {
            return 0;
        }
        return data[index] + sumArrayFromIndex(data, index+1);

    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        if(s == null) {
            return null;
        }
        if(s.length() <= 1) {
            return s;
        }
        //Take all characters of s except for the first character and call reverse(...)
        //The last character becomes the first character and then the other characters are added to the string (last - first character)
        return reverse(s.substring(1)) + s.charAt(0); //Recursive case
    }
}
