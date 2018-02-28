// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length; //size of array
        Arrays.sort(A); //sort uses Arrays
        if (size == 1 && A[0] > 0) { //for short arrays
            if (A[0] > 1){
                return A[0]-1;
            }
            else return 2;
        }
        int j=0; //count first positive integer
        for (int i=0; i<size; i++){
                if (A[i]>0) {
                    if (A[j]>1)return 1; //check if first positive integer is > 1 -> return 1
                    if (i < size-2){ //check different between two array elements
                        if (A[i+1]-A[i] > 1) return A[i]+1;
                    }
                    else
                    {
                        if (A[i]-A[i-1] > 1) return A[i-1]+1;   
                    }
                    if (i==size-1) return A[i]+1; // if last element is missing
                }
                else j++; //position of first positive integer
        }
        return 1;
    }
}