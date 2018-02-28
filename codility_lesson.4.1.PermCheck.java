// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length; //size of array
        if (size== 1){             //small array if A[0] = 1 ok, but <> 1 return 0;
            if (A[0] == 1) return 1;   
            else return 0;
        }
        Arrays.sort(A); //sort uses Arrays
        // if (A[0] != 1) return 0; 
        for (int i=0; i<size; i++){
            if (i < size-1) {
                if ((A[i+1] - A[i]) != 1) return 0; //check sum between two elements
            }
            else{ 
                if ((A[i] - A[i-1]) != 1) return 0; //check sum between two last elements
            }
        }            
    return 1;    
    }
}