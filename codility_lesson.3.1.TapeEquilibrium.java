// you can also use imports, for example:
// import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 50/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        int ret=10000;
        int size = A.length;
        int sum = IntStream.of(A).sum();
        for (int i=1; i<size; i++){
            int[] firstArray = Arrays.copyOfRange(A, 0, i); //new array, it will be end
            int sumB = IntStream.of(firstArray).sum();
            if (Math.abs(sum - 2*sumB) < ret) ret = Math.abs(sum - 2*sumB);
        }
        return ret;
    }
}