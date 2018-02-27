// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 55/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean sprawdz;  
        int size = A.length; //size of array
        for (int i=0; i<size; i++){ //check every element in array
            sprawdz = false;
            for (int j=0; j<size; j++){ //compare every element with every other
                if (A[i] == A[j] && (j != i)) sprawdz = true; //looking for paired element (not the same)
            }
            if (sprawdz == false) return A[i]; //if find unpaierd element
        }
    return 0;    
    }
}


/*Alternative solution
int result = 0;
for(int i : A)
    result ^= i; //XOR
*/
