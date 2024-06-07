/*
 Use the following sorting algorithms tosort an array in DESCENDING order :
 a.Selection Sort
  You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
 */


package Sorting;

import java.util.Arrays;

public class question2 {
    public static void selectionsort(int[] nums){
        for(int i = 0 ; i<nums.length-1 ; i++){
            int numpos = i ;
            for(int j = i+1 ; j<nums.length-1 ; j++){
                if(nums[numpos] > nums[j]){
                    numpos = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[numpos];
            nums[numpos] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main (String args[]){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
        selectionsort(array);;
    }
}
