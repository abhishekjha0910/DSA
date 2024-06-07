/*
 Use the following sorting algorithms tosort an array in DESCENDING order :
 a.Bubble Sort . 
 You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
 */



package Sorting;

import java.util.Arrays;

public class question1 {
    public static void bubblesorting(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = 0 ; j<nums.length-i-1 ; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {3,6,2,1,8,7,4,5,3,1};
        bubblesorting(nums);
    }
}
