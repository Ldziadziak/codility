// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
//import java.util.ArrayUtils;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { // 100/100 pkt
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int size = A.length; //length of Array AC
        if (size != 0 || size == K) { //check if array is empty or rotation is not necessary 
            if (K>size) K = K % size; //if rotation is > size of array, we can K modulo size
            int[] firstArray = Arrays.copyOfRange(A, 0, size-K); //new array, it will be end
            int[] secondArray = Arrays.copyOfRange(A, size-K, size);  // new array, it will be begining
            int[] sol = new int[size]; //solution array
            for (int i=0; i<size; i++){
                if (i < K) sol[i] = secondArray[i]; //rewrite second array
                else sol[i] = firstArray[i-K]; //rewrite first array
            }
            return  sol;
        }
        else return A;
    }
}