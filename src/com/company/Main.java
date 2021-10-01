package com.company;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Write a program that creates an array of integers
        with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
/*
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(Arrays.toString(array));*/


        /*Write a program that returns the middle element in an array.
                Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
*//*
        int[] array = {13, 5, 7, 68, 2};
        System.out.println(array[2]);*/

        /*Write a program that creates an array of String type and initializes it with the
    strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method.
            Use the Arrays.toString( )
        method on the new array to verify that the original array was copied.*//*

        String[] sArray = { "red", "green", "blue", "yellow"};
        System.out.println(sArray.length);

        String[] copyArray = sArray.clone();
        System.out.println(Arrays.toString(copyArray));*/

       /* *//*Write a program that creates an integer array with 5 elements (i.e., numbers).
            The numbers can be any integers.  Print out the value at the first index and the last index using length - 1
        as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
                Notice the type of exception which is produced. Now try to assign a value to the array index 5.
        You should get the same type of exception.*//*
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        System.out.println(array[0] + " " + array[array.length]);*/

        /*Write a program where you create an integer array with a length of 5. Loop through the array and assign
        the value of the loop control variable (e.g., i) to the corresponding index in the array.*/

        /*int[] array = new int[5];
        for ( int i = 0; i < array.length; i++)
        {
            array[i] = i*2;
           // System.out.println(array[i]);
        }
        for ( int i = 0; i < array.length; i++)
        {
            if ( i != 2)
                System.out.println(array[i]);
        }*/

        /*Write a program that creates a String array of 5 elements and swaps the first element with
        the middle element without creating a new array.*/
       /* String[] sArray = {"Pranav", "Vidhi", "Pranidhi", "Vipra", "Love"};
        String swap = sArray[2];
        sArray[0] = swap;
        System.out.println(Arrays.toString(sArray));*/

        /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, print the smallest and the largest element of the array.
        The output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13*/
/*
        int[] Array = {4, 2, 9, 13, 1, 0};

        Arrays.sort(Array);
        System.out.print("Array in ascending order: ");
        System.out.println(Arrays.toString(Array));
        System.out.println("The smallest number is " + Array[0] + " " + "\nThe biggest number is " + Array[Array.length-1]);*/

       /* Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
        boolean b = false;
        Object[] objArray = {"P", "V", 25, 10D, b};
        System.out.println(Arrays.toString(objArray));
    }
}
