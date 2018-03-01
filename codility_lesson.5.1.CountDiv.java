// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { /// 100/100 pkt
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
    int div_A = 0, div_B = 0, sol = 0;
        
        div_A = A/K; // how many divisible have A 
        div_B = B/K; // how many divisible have B
        
        sol = div_B - div_A;
        if (A % K == 0 ) sol++;
        return sol;
        
    /*    int count = 0; toooo sloooow
        for (int i=A; i<=B; i+=K)
            count++;
    return count; */
    }
}