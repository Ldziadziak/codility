// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        double min = Double.MAX_VALUE;
        int index = 0; // position of begin minimal slice
        int size = A.length;
        double two_slice = 100001, three_slice = 100001;
        for (int i=0; i<size-1; i++){
            two_slice = (A[i]+A[i+1])/2.0; //avg each two slices
            if (i< size-2) three_slice = (A[i]+A[i+1]+A[i+2])/3.0; //avg each three 
            double min_slice = Math.min(two_slice, three_slice); //get smalest slice
            
            if (min_slice<min){ //if smalest actual slice is the SMALLEST ?
                min = min_slice; //new smallest
                index = i; //save position
            }
        }
        return index;
    }
}