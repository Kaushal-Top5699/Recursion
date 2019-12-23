package com.kaushaltop;

public class Main {

    public static void main(String[] args) {

        System.out.println(recursiveLinearSearch(new int[] {4, 48, 4, 28, 34, 76, 9, 3}, 0, 48));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(recursiveBinarySearch(new int[] {3, 4, 4, 9, 28, 34, 48, 76}, 48, 0, 7));

    }

    public static int recursiveLinearSearch(int[] array, int i, int x) {

        if (i > array.length-1) {

            System.out.println(x+" was not found");
            return -1;

        } else if (array[i] == x){

            System.out.println("["+x+"] found at position "+i);
            return x;

        } else {

            System.out.println("Index at: "+i);
            return recursiveLinearSearch(array, i+1, x);
        }
    }

    public static int recursiveBinarySearch(int[] array, int x, int left, int right) {

        if (left > right) {

            System.out.println(x+" was not found");
            return -1;

        } else {

            int mid = (left+right)/2;

            if (array[mid] == x) {

                System.out.println("["+x+"] found at position "+mid);
                return x;

            } else if (array[mid] > x){

                System.out.println("Index at: "+mid);
                right = mid-1;
                return recursiveBinarySearch(array, x, left, right);

            } else {

                System.out.println("Index ar: "+mid);
                left = mid+1;
                return recursiveBinarySearch(array, x, left, right);
            }
        }
    }
}
