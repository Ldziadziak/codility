// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int []check = new int[X+1]; //new array for jumps
        int size = A.length;
        int j = 0;
        for (int i=0; i<size; i++){
            if (check[A[i]] == 0){ //check if we have unique leaf
                check[A[i]] = A[i]; //if unique leaf, 
                j += 1; //counter
                if (j == X) return i;
            } 
        }
    return -1;   
    }
}