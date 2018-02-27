// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 90/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A == null) return 1; //check if array is empty
        int size = A.length; //size of array
        Arrays.sort(A); //sort uses Arrays
        if (A[0] == 2) return 1; //if first element is 2 not 1, then missing is 1
        if (size == 1) return A[0]+1; // if we have only one element
        for (int i=1; i<size; i++){
                if (A[i]-A[i-1] > 1) return A[i-1]+1; //sum between two elements is > 1
                if (i==size-1) return A[i]+1; // if last element is missing
        }
        return 0;
    }
}