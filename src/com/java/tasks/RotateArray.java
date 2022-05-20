package com.java.tasks;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] rotate = {1, 2, 3, 4, 5, 6, 7};
        int count = 3;
        int length = rotate.length - 1;
        for (int i = 0; i < count; i++) {
            int temp = rotate[0];
            for (int j = 0; j < length + 1; j++) {
                if (j < length) rotate[j] = rotate[j + 1];
                else rotate[length] = temp;
            }
        }
        System.out.println(Arrays.toString(rotate));
    }
}
