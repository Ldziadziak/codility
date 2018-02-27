// you can also use imports, for example:
// import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 50/100 pkt
    public int solution(int[] A) {
        // write your code in Java SE 8
        int ret=10000; // max different
        int size = A.length; //size of array
        int sum = IntStream.of(A).sum(); // sum of each element 
        for (int i=1; i<size; i++){
            int[] firstArray = Arrays.copyOfRange(A, 0, i); //new array 
            int sumB = IntStream.of(firstArray).sum(); //sum element of new array
            if (Math.abs(sum - 2*sumB) < ret) ret = Math.abs(sum - 2*sumB); // array sub new 2*array
        }
        return ret;
    }
}