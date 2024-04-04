/*Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order*/

import java.util.Arrays;
public class Question1 {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length; 
        int n = Y.length; 
        
        
        int i = m - n - 1; 
        int j = 0;         
        int k = 0;         
        
        
        while (i >= 0 && j < n) {
            if (X[i] > Y[j]) {
                X[k++] = Y[j++]; 
            } else {
                X[k++] = X[i--]; 
            }
        }
        
        
        while (j < n) {
            X[k++] = Y[j++]; 
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        System.out.println("Output: X[] = " + Arrays.toString(X));
    }
}
