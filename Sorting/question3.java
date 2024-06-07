/*
 Use the following sorting algorithms tosort an array in DESCENDING order 
 a.Insertion Sort
 You can use this array as an example :[3,6,2,1,8,7,4,5,3,1
 */


package Sorting;

import java.util.Arrays;

public class question3 {
    public static void incertionsort(int arr[]){
        for(int i  = 0 ; i<arr.length;i++){
            int curr = arr[i] ;
            int prev = i-1;
            while(prev>= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }       
        System.out.println(Arrays.toString(arr));
    }
    public static void main (String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        incertionsort(arr);
    }
}
