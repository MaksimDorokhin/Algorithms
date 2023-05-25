package Algoritms;

import java.util.Random;

import static Algoritms.Sem02_2.quickSort;
import static Algoritms.Sem02_4.binarySearch;
import static Algoritms.Sem02_4.linearSearch;

public class Sem02_1 {
    public static void main(String[] args) {
        int[] array = createArray(1000);
        long start = System.nanoTime();
        bubbleSort(array);
        long end = System.nanoTime();
        System.out.println(end - start);
        array = createArray(25000);
        start = System.nanoTime();
        shakerSort(array);
        end = System.nanoTime();
        System.out.println(end - start);
        array = createArray(25000);
        quickSort(array, 0, array.length-1);
        start = System.nanoTime();
        linearSearch(array, 10);
        end = System.nanoTime();
        System.out.println(end - start);
        start = System.nanoTime();
        binarySearch(array, 10);
        end = System.nanoTime();
        System.out.println(end - start);
    }
    public static int[] createArray(int n) {
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(250);
        }
        return array;
    }


    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
    public static void shakerSort(int[] values) {
        if (values.length == 0) {
            return;
        }
        int left = 0;
        int right = values.length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (values[i - 1] > values[i]) {
                    int temp = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = temp;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
//                    swap(values[i], values[i + 1]);
                }
            }
            --right;
        }
    }
}