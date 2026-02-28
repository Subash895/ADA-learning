package com.subash.ada;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            //System.out.println(arr[i]+" ");
            int minIndex = i;
            for (int j = i+1; j < n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr)); // Printing the sorted array
    }
    public static void main(String[] args)  {
        int[] arr ={2,4,5,6,4};
        SelectionSort sorts=new SelectionSort();
        sorts.sort(arr);
    }
}
