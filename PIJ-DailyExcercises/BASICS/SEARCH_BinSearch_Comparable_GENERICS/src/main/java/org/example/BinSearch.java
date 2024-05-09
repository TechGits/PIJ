package org.example;

public class BinSearch <T extends  Comparable <T>>{

    public int binSearch (T[] arr, T target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = arr[mid].compareTo(target);
            if (cmp == 0) {
                return mid;
            }
            if (cmp < 0) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }

    public void printArr (T[] arr, T target) {
        int result = binSearch(arr,target);
        if (result != -1) {
            System.out.println(target+" is at position "+result);

        } else System.out.println(target+ "not found.");
    }
}
