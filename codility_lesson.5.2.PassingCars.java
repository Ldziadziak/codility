// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0, inc = 0; 
        for (int i=0; i<A.length; i++){ // for each element in A
            if (A[i] == 0) inc++; 
            else {
				count += inc;
				if (count > 1000000000) return -1;            
            }           
        }
    return count;    
        
              
        
        /* int count = 0; // too sloow solution
        for (int i=0; i<A.length; i++){
            if (A[i] == 0){
                for (int j=i+1; j<A.length; j++){
                    if (A[j] == 1) count++; 
                }   
            }
        }
    return count; */
    }
}