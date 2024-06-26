/*
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 Example 1:
 Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]
 Output:   6 
 Explanation:The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
 In this case, 6 units of rain water (blue section) are being trapped.
 Example 2:
 Input:height = [4, 2, 0, 3, 2, 5]
 Output:   9 
 Constraints:•n == height . length•
 1 <= n <= 2 * 104•
 0 <= height [ i ] < = 105
 */



package Array;

public class question4 {
    public static int watertrap(int[] height ){
        int m = height.length;
        int res = 0 , l = 0 , r = m-1;
        int rmax = height[r] , lmax = height[l];
        while(l < r){
            if(lmax < rmax){
                 l++;
                lmax = Math.max(lmax, height[l] );
                res += lmax - height[l];
               
            }
            else{
                r--; 
                rmax = Math.max(rmax, height[r]); 
                res += rmax - height[r];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(watertrap(height));
    }
}
