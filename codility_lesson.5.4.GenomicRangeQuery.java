// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int [][] PrefixSum = new int[3][S.length()+1]; //array for prefix sums
        
        for (int i=0; i<S.length(); i++){ //fill
            char a = S.charAt(i);
            switch (a) {
                case 'A': //if find 'A' inc 0, fill 1 and 2
                    PrefixSum[0][i+1] = PrefixSum[0][i]+1;
                    PrefixSum[1][i+1] = PrefixSum[1][i];
                    PrefixSum[2][i+1] = PrefixSum[2][i];
                break;
                case 'C': //if find 'C' inc 1, fill 0 and 2
                    PrefixSum[0][i+1] = PrefixSum[0][i];
                    PrefixSum[1][i+1] = PrefixSum[1][i]+1;
                    PrefixSum[2][i+1] = PrefixSum[2][i];
                break;
                case 'G': //if find 'G' inc 2, fill 0 and 1
                    PrefixSum[0][i+1] = PrefixSum[0][i];
                    PrefixSum[1][i+1] = PrefixSum[1][i];
                    PrefixSum[2][i+1] = PrefixSum[2][i]+1;
                break;
                default: //if find 'T' fill 0, fill 1 and 2
                    PrefixSum[0][i+1] = PrefixSum[0][i];
                    PrefixSum[1][i+1] = PrefixSum[1][i];
                    PrefixSum[2][i+1] = PrefixSum[2][i];
                break;
            }
        }
       
        for (int j=0; j<Q.length; j++){
            int b = P[j], e = Q[j]+1; 
                    if (PrefixSum[0][e] - PrefixSum[0][b] > 0){ //we are looking lowest value
                        P[j]=1;
                    } else if (PrefixSum[1][e] - PrefixSum[1][b] > 0){
                        P[j]=2;     
                    } else if (PrefixSum[2][e] - PrefixSum[2][b] > 0){
                        P[j]=3;     
                    } else P[j]= 4;    

        }   
        return P;    
        
        /* char[] chars = S.toCharArray(); // good solution, but slow
        for (int i=0; i<chars.length; i++){
            if (chars[i] == 'A') chars[i] = 1;
            if (chars[i] == 'C') chars[i] = 2;
            if (chars[i] == 'G') chars[i] = 3;
            if (chars[i] == 'T') chars[i] = 4;
        }
        for (int i=0; i<P.length; i++){
            int min = 5;
            for (int j=P[i]; j<=Q[i]; j++) {
                if (chars[j] < min) { 
                    min = chars[j];
                    P[i] = min;
                }
            }
        } 
        
        
        
        return P;*/
    }
}