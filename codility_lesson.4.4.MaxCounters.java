// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 77/100 pkt
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int []solution = new int[N];
        int size = A.length;
        int max = 0;
        for (int i=0; i<size; i++){
            if (A[i]>N){
                Arrays.fill(solution, max);  
            }
            else{
                solution[A[i]-1]++; 
                if (solution[A[i]-1] > max) max = solution[A[i]-1];
            }
        }
        
        
        
    /*    for (int j=0; j<size; j++){        // tooo sloow soluution
            for (int i=0; i<N; i++){
                if (A[j]>N){
                    solution[i]= max;
                   // System.out.println(max);
                }
                else {
                    if (A[j] == (i+1)) {
                        solution[i]++;
                        if (solution[i]>max) max = solution[i];
                    }
                }
            }
        }
    */        
        
        
        
    return solution;
    }
}