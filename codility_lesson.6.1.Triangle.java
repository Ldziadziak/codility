// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
		if (size<3) return 0; //if array length< 3 we cant create triangle
        
        Arrays.sort(A);
        
        for (int i=0; i<size-2; i++){
            if (A[i]>A[i+2]-A[i+1]) return 1; // 3 > 5 - 4 we can create triangle 
            
        }
              
    return 0;    
    }
}