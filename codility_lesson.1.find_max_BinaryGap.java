// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int solution(int N) {
        int solution=0, max=0; //create two int variables, memo-max, solution-actual counter
        char[] chars = Integer.toBinaryString(N).toCharArray(); //integer -> binary string -> charArray
        for (int i=0; i<chars.length; i++){ // for each element in charArray
            if (chars[i]== '0') { 
                solution++; // if find '0' then increment solution
            }
            else{
                if (solution>max ){ // if chars[i] != '0' then check counter
                    max = solution; // memo max value of counter
                }
                solution=0; //reset counter
            }
        }
    return max;    
    }
}