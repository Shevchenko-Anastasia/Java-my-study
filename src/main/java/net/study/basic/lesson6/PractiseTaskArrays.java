package net.study.basic.lesson6;

import java.util.Arrays;
import java.util.Random;

public class PractiseTaskArrays {

    public static void main(String[] args) {

        final Random random = new Random();

        int[] intArray = new int[10];

        System.out.println(Arrays.toString(intArray));

        for (int i = intArray.length/2 ; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100); //(i + 1)/
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(i +"=" + intArray[i]);
        }

        System.out.println(Arrays.toString(intArray));
    }
}
