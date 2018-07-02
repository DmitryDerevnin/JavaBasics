package main;

import level_three.ArrayTest;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.countClumps(arr);
}
}
