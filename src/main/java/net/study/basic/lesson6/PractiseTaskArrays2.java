package net.study.basic.lesson6;

import java.util.Arrays;

public class PractiseTaskArrays2 {
    public static void main(String[] args) {
        int[] intArray = {4, 5, 3, 8, 10, 7};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray[i] * 5;
            System.out.println(intArray[i]);
        }
        System.out.println("_________________");

        int[] myIntArray = {4, 6, 3, 8, 10, 7};

        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] > 5) {
                myIntArray[i] = myIntArray[i] * 5;
                System.out.println(myIntArray[i]);
            } else {
                myIntArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(myIntArray));
    }
}
